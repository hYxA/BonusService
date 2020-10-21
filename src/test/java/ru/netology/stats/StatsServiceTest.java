package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int expectedSumm = 180;
    long expectedAverage = 15;

    //int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService StatisticService = new StatsService();

    @Test
    void calculateSumm() {

        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int summ = StatisticService.sumCalculate(deals, expectedSumm);
        assertEquals(expectedSumm, summ);

    }

    @Test
    void calculateAverage() {
        int summ = 180;
        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long average = StatisticService.averageCalculate(summ, deals);
        assertEquals(expectedAverage, average);

    }

    @Test
    void calculateMaxDealsIndex() {

        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxDealsIndex = 8;
        int maxDealsIndex = StatisticService.maxDealsIndex(deals);
        assertEquals(expectedMaxDealsIndex, maxDealsIndex);

    }

    @Test
    void calculateMinDealsIndex() {

        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinDealsIndex = 9;
        int minDealsIndex = StatisticService.minDealsIndex(deals);
        assertEquals(expectedMinDealsIndex, minDealsIndex);

    }

    @ParameterizedTest(name = "[{index}] calculateBelowAverage")
    @CsvSource(value = {
            "8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 15, 5"
    })
    void calculateBelowAverage(int month1, int month2, int month3, int month4, int month5, int month6,
                               int month7, int month8, int month9, int month10, int month11, int month12, long expectedAverage, int expectedBelowAverage) {

        int belowAverage = StatisticService.belowAverage(month1, month2, month3, month4, month5,
                month6, month7, month8, month9, month10, month11, month12, expectedAverage);
        assertEquals(expectedBelowAverage, belowAverage);

    }

    @ParameterizedTest(name = "[{index}] calculateAboveAverage")
    @CsvSource(value = {
            "8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 15, 5"
    })
    void calculateAboveAverage(int month1, int month2, int month3, int month4, int month5, int month6,
                               int month7, int month8, int month9, int month10, int month11, int month12, long expectedAverage, int expectedAboveAverage) {

        int aboveAverage = StatisticService.aboveAverage(month1, month2, month3, month4, month5,
                month6, month7, month8, month9, month10, month11, month12, expectedAverage);
        assertEquals(expectedAboveAverage, aboveAverage);

    }
}