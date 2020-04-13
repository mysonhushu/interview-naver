package com.naver.bean;

public class LeastRecentlyUsedItem implements Comparable<LeastRecentlyUsedItem> {
    private String itemName;
    private volatile Integer usedCount;

    public LeastRecentlyUsedItem(String itemName, Integer usedCount) {
        this.itemName = itemName;
        this.usedCount = usedCount;
    }

    public synchronized void increase() {
       if (null == usedCount) {
           usedCount = 1;
       } else {
           usedCount = usedCount + 1;
       }
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    @Override
    public int compareTo(LeastRecentlyUsedItem o) {
        return this.usedCount.compareTo(o.usedCount);
    }
}
