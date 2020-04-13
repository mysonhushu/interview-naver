package com.naver.utils;

import java.util.HashMap;
import java.util.Map;

public class PriorityTask {
    public static final Map<String, Integer> priorityMap;
    static {
       priorityMap = new HashMap<>();
       //Task H, Task B, Task G, Task C, Task E, Task A, Task D, Task F
       priorityMap.put("Task H", 1);
       priorityMap.put("Task B", 2);
       priorityMap.put("Task G", 3);
       priorityMap.put("Task C", 4);
       priorityMap.put("Task E", 5);
       priorityMap.put("Task A", 6);
       priorityMap.put("Task D", 7);
       priorityMap.put("Task F", 8);
    }
}
