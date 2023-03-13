package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void allSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.allSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void middleSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 15;
        int actualSales = service.middleSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 8;
        int actualSales = service.maxSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void minSalse() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 9;
        int actualSales = service.minSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 5;
        int actualSales = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void salesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 5;
        int actualSales = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }
}