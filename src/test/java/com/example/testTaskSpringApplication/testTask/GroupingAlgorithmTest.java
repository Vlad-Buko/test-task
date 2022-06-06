package com.example.testTaskSpringApplication.testTask;

import com.example.testTaskSpringApplication.testTaskForInterview.GroupedCounterAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Vladislav Domaniewski
 */

public class GroupingAlgorithmTest {
    private static final long [] numbers = {1, 2, 4, 4, 2, 1, 0, 2, 4};
    private GroupedCounterAlgorithm algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new GroupedCounterAlgorithm();
    }
    @Test
    void shouldGroupUniqueElementsByValue() {
        Map<Long, Long> groupedValue = algorithm.execute(numbers).get();
        System.out.println(groupedValue);
        assertThat(groupedValue.get(0L)).isEqualTo(1);
        assertThat(groupedValue.get(1L)).isEqualTo(2);
        assertThat(groupedValue.get(2L)).isEqualTo(3);
        assertThat(groupedValue.get(4L)).isEqualTo(3);
    }

    @Test
    void shouldSortDescendingly() {
        Map <Long, Long> groupedValues = algorithm.execute(numbers).sort().get();
        assertThat(groupedValues.keySet()).containsExactly(4L, 2L, 1L, 0L);
    }

}
