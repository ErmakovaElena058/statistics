import org.example.statistics.services.StatisticsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {

    @Test
    public void Sum() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Average() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxMonth() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxMonth(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinMonth() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minMonth(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void BelowAvg() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.countBelowAvg(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AboveAvg() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.countAboveAvg(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
