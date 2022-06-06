package com.example.testTaskSpringApplication.testTaskForInterview;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vladislav Domaniewski
 */

public class TestMain {
    public static void main(String[] args) {
        GroupedCounterAlgorithm gr = new GroupedCounterAlgorithm();
        Map <Long, Long> number = new HashMap<>();
        long [] some = {1, 4, 4, 5};

        gr.execute(some).sort();
    }
}
