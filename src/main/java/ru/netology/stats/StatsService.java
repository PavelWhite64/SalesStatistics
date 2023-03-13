package ru.netology.stats;

public class StatsService {

    public int allSales(int[] sales) {
        int allSales = 0;

        for (int t : sales) {
            if (t > 0) {
                allSales = allSales + t;
            }
        }
        return allSales;
    }

    public int middleSales(int[] sales) {
        int allSales = 0;
        int middleSales = 0;

        for (int t : sales) {
            if (t > 0) {
                allSales = allSales + t;
                middleSales = allSales / 12;
            }
        }
        return middleSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int middleSales = middleSales(sales);
        int salesBelowAverageMonth = 0;

        for (int t : sales) {
            if (t < middleSales) {
                salesBelowAverageMonth = salesBelowAverageMonth + 1;
            }
        }
        return salesBelowAverageMonth;
    }

    public int salesAboveAverage(int[] sales) {
        int middleSales = middleSales(sales);
        int salesAboveAverageMonth = 0;

        for (int t : sales) {
            if (t > middleSales) {
                salesAboveAverageMonth = salesAboveAverageMonth + 1;
            }
        }
        return salesAboveAverageMonth;
    }
}

