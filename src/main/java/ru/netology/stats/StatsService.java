package ru.netology.stats;

public class StatsService {
    public int amountSalesYear(long[] sales) {
        int amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public int averageAmountMonth(long[] sales) {

        return amountSalesYear(sales) / sales.length;

    }

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

    public int minAverageAmountMonth(long[] sales) {

        int minSalesMonth = 0;
        int average = averageAmountMonth(sales);
        for (long sale : sales) {
            if (sale < average) {
                minSalesMonth = minSalesMonth + 1;
            }
        }
        return minSalesMonth;
    }

    public int maxAverageAmountMonth(long[] sales) {

        int minSalesMonth = 0;
        int average = averageAmountMonth(sales);
        for (long sale : sales) {
            if (sale > average) {
                minSalesMonth = minSalesMonth + 1;
            }
        }
        return minSalesMonth;
    }
}
