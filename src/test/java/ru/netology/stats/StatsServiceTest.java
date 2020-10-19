package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    //int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService StatisticService = new StatsService();

    @ParameterizedTest //(index = 0)
    @CsvSource(value = {
            "calculateSumm, deals, 180"
    })
    void calculateSumm(String testName, int[] deals, int expectedSumm) {

        int summ = StatisticService.sumCalculate(deals, expectedSumm);
        assertEquals(expectedSumm, summ);

    }

    @ParameterizedTest
    @CsvSource(value = {
            "calculateAverage, 180, 15"
    })
    void calculateAverage(String testName, int[] deals, int expectedSumm, long expectedAverage) {

        long average = StatisticService.averageCalculate(deals.length, expectedSumm, expectedAverage);
        assertEquals(expectedAverage, average);

    }

    @ParameterizedTest
    @CsvSource(value = {
            "calculateMaxDealsIndex, 8"
    })
    void calculateMaxDealsIndex(String testName, int[] deals, int expectedMaxDealsIndex) {

        int maxDealsIndex = StatisticService.maxDealsIndex(deals, expectedMaxDealsIndex);
        assertEquals(expectedMaxDealsIndex, maxDealsIndex);

    }

    @ParameterizedTest
    @CsvSource(value = {
            "calculateMinDealsIndex, 9"
    })
    void calculateMinDealsIndex(String testName, int[] deals, int expectedMinDealsIndex) {

        int minDealsIndex = StatisticService.minDealsIndex(deals, expectedMinDealsIndex);
        assertEquals(expectedMinDealsIndex, minDealsIndex);

    }

    @ParameterizedTest
    @CsvSource(value = {
            "calculateBelowAverage, 5"
    })
    void calculateBelowAverage(String testName, int[] deals, long expectedAverage, int expectedBelowAverage) {

        int belowAverage = StatisticService.belowAverage(expectedAverage, deals, expectedBelowAverage);
        assertEquals(expectedBelowAverage, belowAverage);

    }

    @ParameterizedTest
    @CsvSource(value = {
            "calculateAboveAverage, 5"
    })
    void calculateAboveAverage(String testName, int[] deals, long expectedAverage, int expectedAboveAverage) {

        int aboveAverage = StatisticService.aboveAverage(expectedAverage, deals, expectedAboveAverage);
        assertEquals(expectedAboveAverage, aboveAverage);

    }
}