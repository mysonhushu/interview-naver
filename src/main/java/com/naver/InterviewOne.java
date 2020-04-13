package com.naver;

import com.naver.bean.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewOne {

    public String process(String line) {
       if (null == line) {
           throw new RuntimeException("please input test dat like: Task A, Task B, Task C, Task D, Task E, Task F, Task G, Task H");
       }

       String[] values = line.trim().split(",");
       List<Node> nodes = new ArrayList<>(values.length);
       for(String value : values) {
          Node node = new Node(value);
          nodes.add(node);
       }

       Collections.sort(nodes);

       StringBuilder result = new StringBuilder();

       result.append(nodes.stream().map(p -> p.getName()).collect(Collectors.joining(", ")));
       return result.toString();
    }

}
