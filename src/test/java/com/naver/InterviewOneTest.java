package com.naver;

import org.junit.Test;

public class InterviewOneTest {

    @Test
    public void testProcess() {
        String testInput = "Task A, Task B, Task C, Task D, Task E, Task F, Task G, Task H";
        InterviewOne interviewOne = new InterviewOne();
        String testOutput = interviewOne.process(testInput);
        System.out.println("Test input:" + testInput);
        System.out.println("Test output:" + testOutput);
    }
}
