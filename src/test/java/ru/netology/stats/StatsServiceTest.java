package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @CsvSource(value ={
            "'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 180, 15, 8, 9, 5, 5"
    })
    StatsService StatisticService = new StatsService();

    @ParameterizedTest
    void calculateSumm(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                       int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        int summ = StatisticService.sumCalculate(deals, expectedSumm);
        assertEquals(expectedSumm, summ);

    }
    @ParameterizedTest
    void calculateAverage(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                          int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        long average = StatisticService.averageCalculate(deals.length, expectedSumm, expectedAverage);
        assertEquals(expectedAverage, average);

    }
    @ParameterizedTest
    void calculateMaxDealsIndex(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                          int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        int maxDealsIndex = StatisticService.maxDealsIndex(deals, expectedMaxDealsIndex);
        assertEquals(expectedMaxDealsIndex, maxDealsIndex);

    }
    @ParameterizedTest
    void calculateMinDealsIndex(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                                int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        int minDealsIndex = StatisticService.minDealsIndex(deals, expectedMinDealsIndex);
        assertEquals(expectedMinDealsIndex, minDealsIndex);

    }
    @ParameterizedTest
    void calculateBelowAverage(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                               int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        int belowAverage = StatisticService.belowAverage(expectedAverage, deals, expectedBelowAverage);
        assertEquals(expectedBelowAverage, belowAverage);

    }
    @ParameterizedTest
    void calculateAboveAverage(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                               int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {

        int aboveAverage = StatisticService.aboveAverage(expectedAverage, deals, expectedAboveAverage);
        assertEquals(expectedAboveAverage, aboveAverage);

    }
}