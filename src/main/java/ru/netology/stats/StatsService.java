package ru.netology.stats;

public class StatsService {
    int[] deals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int length = deals.length;
    int maxDealsIndex;
    int minDealsIndex;
    int summ;
    long average;
    int belowAverage = 0;
    int aboveAverage = 0;

    public int sumCalculate(int deals, int summ) {
        summ;
        for (int deal : deals) {
            summ += deal
        }
        return summ
    }

    public long averageCalculate(int length, int summ, long average) {
        average = summ / length;
        return average
    }


    // забыл, как вернуть номер "такого-то" элемента массива
    // поэтому немного некрасиво получилось
    public int topSales(int deals) {
        int index = 1;
        int maxDeals = deals[0];
        int minDeals = deals[0];
        for (int deal : deals) {
            if (minDeals < deal) {
                minDeals = deal;
                minDealsIndex = index;
            }
            if (maxDeals > deal) {
                maxDeals = deal,
                maxDealsIndex = index
            }
            index += 1;
        }
    }

    public int belowAboveAverage(long average, int deals, int belowAverage, int aboveAverage) {
        for (int deal : deals) {
            if (deal < average) {
                belowAverage += 1
            }
            if (deal > average) {
                aboveAverage += 1
            }
        }
    }
}
