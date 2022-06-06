package com.example.testTaskSpringApplication.testTaskForInterview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Vladislav Domaniewski
 */

public class GroupedCounterAlgorithm implements Algorithm <long[] , Map <Long, Long>> {

    private static Map <Long, Long> numberReady;
    private Long a = 1L;
    @Override
    public Algorithm<long[], Map<Long, Long>> execute(long[] data) {
        numberReady = new HashMap<>();
        for (int i = 0; i < data.length; i ++) {
            if (numberReady.containsKey(data[i])) {
                numberReady.put(data[i], numberReady.get(data[i])+1);
            } else {
                numberReady.put(data[i], a);
            }
        }
        return this;
    }

    @Override
    public Algorithm<long[], Map<Long, Long>> sort() {
        Map <Long, Long> completed = new TreeMap<>();

        return this;
        }



    @Override
    public Map<Long, Long> get() {
        return numberReady;
    }
}
