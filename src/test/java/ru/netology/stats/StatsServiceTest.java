package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    //int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService StatisticService = new StatsService();

    @ParameterizedTest(name = "[{index}] calculateSumm")
    @CsvSource(value = {
            "8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 180"
    })
    void calculateSumm(int month1, int month2, int month3, int month4, int month5, int month6,
                       int month7, int month8, int month9, int month10, int month11, int month12, int expectedSumm) {

        int summ = StatisticService.sumCalculate(month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12);
        assertEquals(expectedSumm, summ);

    }

    @ParameterizedTest(name = "[{index}] calculateAverage")
    @CsvSource(value = {
            "180, 15"
    })
    void calculateAverage(int expectedSumm, long expectedAverage) {

        long average = StatisticService.averageCalculate(expectedSumm, expectedAverage);
        assertEquals(expectedAverage, average);

    }

    @ParameterizedTest(name = "[{index}] calculateMaxDealsIndex")
    @CsvSource(value = {
            "8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 8"
    })
    void calculateMaxDealsIndex(int month1, int month2, int month3, int month4, int month5, int month6,
                                int month7, int month8, int month9, int month10, int month11, int month12, int expectedMaxDealsIndex) {

        int maxDealsIndex = StatisticService.maxDealsIndex(month1, month2, month3, month4, month5,
                month6, month7, month8, month9, month10, month11, month12);
        assertEquals(expectedMaxDealsIndex, maxDealsIndex);

    }
    @ParameterizedTest
    @CsvSource(value = {
            "8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 9"
    })
    void calculateMinDealsIndex(int month1, int month2, int month3, int month4, int month5, int month6,
                                int month7, int month8, int month9, int month10, int month11, int month12, int expectedMinDealsIndex) {

        int minDealsIndex = StatisticService.minDealsIndex(month1, month2, month3, month4, month5,
                month6, month7, month8, month9, month10, month11, month12);
        assertEquals(expectedMinDealsIndex, minDealsIndex);

    }

    @ParameterizedTest
    @CsvSource(value = {
            "8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 15, 5"
    })
    void calculateBelowAverage(int month1, int month2, int month3, int month4, int month5, int month6,
                               int month7, int month8, int month9, int month10, int month11, int month12, long expectedAverage, int expectedBelowAverage) {

        int belowAverage = StatisticService.belowAverage(month1, month2, month3, month4, month5,
                month6, month7, month8, month9, month10, month11, month12, expectedAverage);
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