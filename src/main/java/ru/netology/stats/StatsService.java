package ru.netology.stats;

public class StatsService {
    int[] deals = new int[12]; // = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int maxDealsIndex;
    int minDealsIndex;
    int expectedSumm;
    int index;
    long average;
    int belowAverage = 0;
    int aboveAverage = 0;

    /**
     * данные по месяцам

    int month1 = 8;
    int month2 = 15;
    int month3 = 13;
    int month4 = 15;
    int month5 = 17;
    int month6 = 20;
    int month7 = 19;
    int month8 = 20;
    int month9 = 7;
    int month10 = 14;
    int month11 = 14;
    int month12 = 18;
     */

    /**
     * перенос данных в массив для удобной обработки и расчётов


    public int[] dataTranferToArray(int month1, int month2, int month3, int month4, int month5, int month6, int month7, int month8, int month9, int month10, int month11, int month12, int[] deals) {
        deals[0] = month1;
        deals[1] = month2;
        deals[2] = month3;
        deals[3] = month4;
        deals[4] = month5;
        deals[5] = month6;
        deals[6] = month7;
        deals[7] = month8;
        deals[8] = month9;
        deals[9] = month10;
        deals[10] = month11;
        deals[11] = month12;

        return deals;
    }
     */
    /**
     * расчёт суммы продаж   */


    public int sumCalculate(int[] deals, int expectedSumm) {
        int summ = 0;
        for (int deal : deals) {
            summ += deal;
        }

        return summ;
    }

    /**
     * расчёт среднего числа продаж в месяц
     */
    public long averageCalculate(int summ, int[] deals) { //, long expectedAverage
        long average = summ / deals.length;
        return average;
    }


    // забыл, как вернуть номер "такого-то" элемента массива, поэтому немного некрасиво

    /**
     * последний месяц с наивысшими продажами
     */
    public int maxDealsIndex(int month1, int month2, int month3, int month4, int month5, int month6,
                             int month7, int month8, int month9, int month10, int month11, int month12) {
        int index = 1;
        maxDealsIndex = 1;
        int maxDeals = month1;
        index += 1; // = 2
        if (maxDeals <= month2) {
            maxDeals = month2;
            maxDealsIndex = index;
        }

        index += 1; // = 3
        if (maxDeals <= month3) {
            maxDeals = month3;
            maxDealsIndex = index;
        }

        index += 1; // = 4
        if (maxDeals <= month4) {
            maxDeals = month4;
            maxDealsIndex = index;
        }

        index += 1; // = 5
        if (maxDeals <= month5) {
            maxDeals = month5;
            maxDealsIndex = index;
        }

        index += 1; // = 6
        if (maxDeals <= month6) {
            maxDeals = month6;
            maxDealsIndex = index;
        }

        index += 1; // = 7
        if (maxDeals <= month7) {
            maxDeals = month7;
            maxDealsIndex = index;
        }

        index += 1; // = 8
        if (maxDeals <= month8) {
            maxDeals = month8;
            maxDealsIndex = index;
        }

        index += 1; // = 9
        if (maxDeals <= month9) {
            maxDeals = month9;
            maxDealsIndex = index;
        }

        index += 1; // = 10
        if (maxDeals <= month10) {
            maxDeals = month10;
            maxDealsIndex = index;
        }

        index += 1; // = 11
        if (maxDeals <= month11) {
            maxDeals = month11;
            maxDealsIndex = index;
        }

        index += 1; // = 12
        if (maxDeals <= month12) {
            maxDeals = month12;
            maxDealsIndex = index;
        }

        return maxDealsIndex;
    }

    /**
     * последний месяц с наихудшими продажами
     */
    public int minDealsIndex(int month1, int month2, int month3, int month4, int month5, int month6,
                             int month7, int month8, int month9, int month10, int month11, int month12) {
        int index = 1;
        minDealsIndex = 1;
        int minDeals = month1;
        index += 1; // = 2
        if (minDeals >= month2) {
            minDeals = month2;
            minDealsIndex = index;
        }

        index += 1; // = 3
        if (minDeals >= month3) {
            minDeals = month3;
            minDealsIndex = index;
        }

        index += 1; // = 4
        if (minDeals >= month4) {
            minDeals = month4;
            minDealsIndex = index;
        }

        index += 1; // = 5
        if (minDeals >= month5) {
            minDeals = month5;
            minDealsIndex = index;
        }

        index += 1; // = 6
        if (minDeals >= month6) {
            minDeals = month6;
            minDealsIndex = index;
        }

        index += 1; // = 7
        if (minDeals >= month7) {
            minDeals = month7;
            minDealsIndex = index;
        }

        index += 1; // = 8
        if (minDeals >= month8) {
            minDeals = month8;
            minDealsIndex = index;
        }

        index += 1; // = 9
        if (minDeals >= month9) {
            minDeals = month9;
            minDealsIndex = index;
        }

        index += 1; // = 10
        if (minDeals >= month10) {
            minDeals = month10;
            minDealsIndex = index;
        }

        index += 1; // = 11
        if (minDeals >= month11) {
            minDeals = month11;
            minDealsIndex = index;
        }

        index += 1; // = 12
        if (minDeals >= month12) {
            minDeals = month12;
            minDealsIndex = index;
        }

        return minDealsIndex;
    }

    /**
     * количество месяцев с количеством продаж ниже среднего
     */
    public int belowAverage(int month1, int month2, int month3, int month4, int month5, int month6,
                            int month7, int month8, int month9, int month10, int month11, int month12, long average) {
        int belowAverage = 0;
        if (average > month1) {
            belowAverage += 1;
        }

        if (average > month2) {
            belowAverage += 1;
        }

        if (average > month3) {
            belowAverage += 1;
        }

        if (average > month4) {
            belowAverage += 1;
        }

        if (average > month5) {
            belowAverage += 1;
        }

        if (average > month6) {
            belowAverage += 1;
        }


        if (average > month7) {
            belowAverage += 1;
        }

        if (average > month8) {
            belowAverage += 1;
        }

        if (average > month9) {
            belowAverage += 1;
        }

        if (average > month10) {
            belowAverage += 1;
        }

        if (average > month11) {
            belowAverage += 1;
        }

        if (average > month12) {
            belowAverage += 1;
        }
        return belowAverage;
    }

    /**
     * количество месяцев с количеством продаж выше среднего
     */
    public int aboveAverage(int month1, int month2, int month3, int month4, int month5, int month6,
                            int month7, int month8, int month9, int month10, int month11, int month12, long average) {
        int aboveAverage = 0;
        if (average < month1) {
            aboveAverage += 1;
        }

        if (average < month2) {
            aboveAverage += 1;
        }

        if (average < month3) {
            aboveAverage += 1;
        }

        if (average < month4) {
            aboveAverage += 1;
        }

        if (average < month5) {
            aboveAverage += 1;
        }

        if (average < month6) {
            aboveAverage += 1;
        }


        if (average < month7) {
            aboveAverage += 1;
        }

        if (average < month8) {
            aboveAverage += 1;
        }

        if (average < month9) {
            aboveAverage += 1;
        }

        if (average < month10) {
            aboveAverage += 1;
        }

        if (average < month11) {
            aboveAverage += 1;
        }

        if (average < month12) {
            aboveAverage += 1;
        }
        return aboveAverage;
    }
}
