package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {
    StatsService amountSales = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void amountSalesYear() {

        long expected = 180;

        long actual = amountSales.amountSalesYear(sales);

        assertEquals(expected, actual);

    }

    @Test
    void averageAmountMonth() {

        long expected = 15;

        long actual = amountSales.averageAmountMonth(sales);

        assertEquals(expected, actual);

    }


    @Test
    void minimalSales() {

        int expected = 9;

        int actual = amountSales.minSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void maximalSales() {

        int expected = 8;

        int actual = amountSales.maxSales(sales);

        assertEquals(expected, actual);

    }


    @Test
    void minimalAverageAmountMonth() {

        int expected = 5;

        int actual = amountSales.minAverageAmountMonth(sales);

        assertEquals(expected, actual);

    }

    @Test
    void maximalAverageAmountMonth() {

        int expected = 5;

        int actual = amountSales.maxAverageAmountMonth(sales);

        assertEquals(expected, actual);

    }

}



