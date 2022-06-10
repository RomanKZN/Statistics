package ru.netology.MonthlySales.cervices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    //1 Сумма всех продаж
    @Test

    public void mustFindTheTotal() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    //2 Средняя сумма продаж
    @Test

    public void mustFindTheAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 15;
        long actualSum = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    //3 Месяц в котором был пик продаж (Примечание: в вашем задании нужно найти последний месяц, соответствующий условиям.)
    @Test

    public void shouldFindTheMaximum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    //4 Месяц в котором был минимум продаж (Примечание: в вашем задании нужно найти последний месяц, соответствующий условиям.)
    @Test

    public void shouldFindTheMinimum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    //5 Кол-во месяцев, в которых продажи были ниже среднего
    @Test

    public void calculateTheNumberOfMonthsMin() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 5;
        long actualSum = service.belowAverage(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    //6 Кол-во месяцев, в которых продажи были выше среднего
    @Test
    public void calculateTheNumberOfMonthsMax() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 5;
        long actualSum = service.aboveAverage(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
}
