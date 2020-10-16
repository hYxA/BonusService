package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @ParameterizedTest
    @CsvSource(value ={
            "'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 180, 15, 8, 9, 5, 5"
    })
    StatsService SService = new StatsService();


    void calculateSumm(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                       int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        int summ = SService.sumCalculate(deals, expectedSumm);
        assertEquals(expectedSumm, summ);

    }

    void calculateAverage(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                          int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        long average = SService.averageCalculate(deals, expectedAverage);
        assertEquals(expectedAverage, average);

    }

    void calculateMaxDealsIndex(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                          int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        int maxDealsIndex = SService.maxDealsIndex(deals, expectedMaxDealsIndex);
        assertEquals(expectedMaxDealsIndex, maxDealsIndex);

    }

    void calculateMinDealsIndex(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                                int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        int minDealsIndex = SService.minDealsIndex(deals, expectedMinDealsIndex);
        assertEquals(expectedMinDealsIndex, minDealsIndex);

    }

    void calculateBelowAverage(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                               int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        int belowAverage = SService.belowAverage(deals, expectedBelowAverage);
        assertEquals(expectedBelowAverage, belowAverage);

    }

    void calculateAboveAverage(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                               int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        int aboveAverage = SService.aboveAverage(deals, expectedAboveAverage);
        assertEquals(expectedAboveAverage, aboveAverage);

    }
}