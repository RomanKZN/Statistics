package ru.netology.MonthlySales.cervices;

public class StatsService {
    //1
    public long sumOfAllSales(long[] sales) {

        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //2
    public long averageSalesAmount(long[] sales) {

        long sum = sumOfAllSales(sales);
        sum = sum / sales.length;

        return sum;
    }

    //3
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //4
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //5

    public int belowAverage(long[] sales) {
        long avg = averageSalesAmount(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    //6
    public int aboveAverage(long[] sales) {
        long avg = averageSalesAmount(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}

