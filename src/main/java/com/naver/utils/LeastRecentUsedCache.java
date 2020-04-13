package com.naver.utils;

import com.naver.bean.LeastRecentlyUsedItem;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.stream.Collectors;

public class LeastRecentUsedCache {
    private Map<String, LeastRecentlyUsedItem> cache = new Hashtable<>();


    public void put(String name) {
        if (cache.containsKey(name)) {
            return;
        }
        LeastRecentlyUsedItem item = new LeastRecentlyUsedItem(name, 0);
        cache.put(name, item);
    }

    public String get(String name) {
        LeastRecentlyUsedItem item = cache.get(name);
        if (null == item) {
            throw new RuntimeException("can't get element: " + name);
        }
        item.increase();
        return item.getItemName();
    }

    public String getLRU(int leastUsedCount) {
        if (leastUsedCount <1) {
            throw new RuntimeException("invalid parameter leastUsedCount:" + leastUsedCount);
        }

        List<LeastRecentlyUsedItem> lruData = new ArrayList<>(leastUsedCount);
        List<LeastRecentlyUsedItem> allData = new ArrayList<>(cache.values());
        Collections.sort(allData);

        Iterator<LeastRecentlyUsedItem> iterator = allData.iterator();
        while (iterator.hasNext() && leastUsedCount >0 ) {
           LeastRecentlyUsedItem item = iterator.next();
           lruData.add(item);
           leastUsedCount = leastUsedCount - 1;
        }
        return lruData.stream().map(p -> p.getItemName() + ":" + p.getUsedCount())
                .collect(Collectors.joining(","));
    }
}
