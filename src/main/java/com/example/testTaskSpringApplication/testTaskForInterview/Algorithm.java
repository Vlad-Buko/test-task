package com.example.testTaskSpringApplication.testTaskForInterview;

import java.util.Map;

public interface Algorithm <T, M> {

    Algorithm<long[], Map <Long, Long>> execute(long [] data);

    Algorithm<long[], Map <Long, Long>> sort();

    Map<Long, Long> get();
}
