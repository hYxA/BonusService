package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @ParameterizedTest
    @CsvSource(value ={
            "'8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 180, 15, 8, 9, 5, 5"    //
    });

    void calculateSumm(int[] deals, int expectedSumm, long expectedAverage, int expectedMaxDealsIndex,
                       int expectedMinDealsIndex, int expectedBelowAverage, int expectedAboveAverage) {
        StatsService SService = new StatsService();

        int summ = SService.sumCalculate(int deals[], expectedSumm);

        assertEquals(expectedSumm, summ);

    }

    void calculateAverage(int[] deals, long average)






}