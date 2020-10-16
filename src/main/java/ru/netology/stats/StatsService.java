package ru.netology.stats;

public class StatsService {
    int[] deals = new int[12]; // = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int maxDealsIndex;
    int minDealsIndex;
    int summ;
    int index;
    long average;
    int belowAverage = 0;
    int aboveAverage = 0;

    public int sumCalculate(int[] deals, int summ) {
        for (int deal : deals) {
            summ += deal;
        }
        return summ;
    }

    public long averageCalculate(int length, int summ, long average) {
        average = summ / deals.length;
        return average;
    }


    // забыл, как вернуть номер "такого-то" элемента массива
    // поэтому немного некрасиво получилось
    public int topSalesMax(int[] deals, int index) {
        index = 1;
        int maxDeals = deals[0];
        for (int deal : deals) {
            if (maxDeals > deal) {
                maxDeals = deal;
                maxDealsIndex = index;
            }
            index += 1;
        }
        return maxDealsIndex;
    }

    public int topSalesMin(int[] deals, int index) {
        index = 1;
        int minDeals = deals[0];
        for (int deal : deals) {
            if (minDeals < deal) {
                minDeals = deal;
                minDealsIndex = index;
            }
            index += 1;
        }
        return minDealsIndex;
    }

    public int belowAverage(long average, int[] deals, int belowAverage) {
        for (int deal : deals) {
            if (deal < average) {
                belowAverage += 1;
            }
        }
    return belowAverage;}

    public int aboveAverage(long average, int[] deals, int aboveAverage) {
        for (int deal : deals) {

            if (deal > average) {
                aboveAverage += 1;
            }
        }
        return aboveAverage;}
}
