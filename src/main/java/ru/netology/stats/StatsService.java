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

    /**
     * расчёт суммы продаж
     */
    public int sumCalculate(int[] deals, int summ) {
        for (int deal : deals) {
            summ += deal;
        }
        return summ;
    }

    /**
     * расчёт среднего числа продаж в месяц
     */
    public long averageCalculate(int length, int summ, long average) {
        average = summ / deals.length;
        return average;
    }


    // забыл, как вернуть номер "такого-то" элемента массива, поэтому немного некрасиво

    /**
     * последний месяц с наивысшими продажами
     */
    public int maxDealsIndex(int[] deals, int index) {
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

    /**
     * последний месяц с наихудшими продажами
     */
    public int minDealsIndex(int[] deals, int index) {
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

    /**
     * количество месяцев с количеством продаж ниже среднего
     */
    public int belowAverage(long average, int[] deals, int belowAverage) {
        for (int deal : deals) {
            if (deal < average) {
                belowAverage += 1;
            }
        }
        return belowAverage;
    }

    /**
     * количество месяцев с количеством продаж выше среднего
     */
    public int aboveAverage(long average, int[] deals, int aboveAverage) {
        for (int deal : deals) {

            if (deal > average) {
                aboveAverage += 1;
            }
        }
        return aboveAverage;
    }
}
