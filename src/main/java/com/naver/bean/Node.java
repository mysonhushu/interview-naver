package com.naver.bean;

import com.naver.utils.PriorityTask;

public class Node  implements Comparable<Node> {
    private String name;

    public String getName() {
        return name;
    }

    public Node(String name) {
        String temp = name.trim();
        if (!PriorityTask.priorityMap.containsKey(temp)) {
            throw new RuntimeException("Invalid input parameter :" + temp);
        }
        this.name = temp;
    }

    @Override
    public int compareTo(Node o) {
        Integer thisNamePriority =  PriorityTask.priorityMap.get(this.name);
        Integer oNamePriority = PriorityTask.priorityMap.get(o.getName());

        return thisNamePriority.compareTo(oNamePriority);
    }
}
