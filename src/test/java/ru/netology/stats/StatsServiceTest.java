package ru.netology.stats;

import org.junit.jupiter.api.Test;


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

    @Test
    void calculateBelowAverage() {

        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long average = 15;
        int expectedBelowAverage = 5;
        int belowAverage = StatisticService.belowAverage(deals, average);
        assertEquals(expectedBelowAverage, belowAverage);

    }

    @Test
    void calculateAboveAverage() {

        int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long average = 15;
        int expectedAboveAverage = 5;
        int aboveAverage = StatisticService.aboveAverage(deals, average);
        assertEquals(expectedAboveAverage, aboveAverage);

    }
}