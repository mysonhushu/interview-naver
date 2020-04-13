package com.naver;

import com.naver.utils.LeastRecentUsedCache;

/**
 *
 */
public class InterviewTwo {
    public void process() {
        LeastRecentUsedCache cache = new LeastRecentUsedCache();
        cache.put("a");
        cache.put("b");
        cache.put("c");
        cache.put("d");
        cache.put("e");
        cache.put("f");
        cache.put("g");
        cache.put("h");
        cache.put("i");
        cache.put("j");
        cache.put("k");
        cache.put("l");

        for (int i=0; i<10; i++) {
            cache.get("a");
        }

        for (int i=0; i<40; i++) {
            cache.get("a");
        }

        for (int i=0; i<4; i++) {
            cache.get("a");
        }

        String out = cache.getLRU(5);
        System.out.println(out);

    }
}
