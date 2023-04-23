package ru.netology.unit;

import org.junit.Test;
import ru.netology.service.CashbackHackService;
import org.junit.Assert;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldRemain100() {
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldRemain1000() {
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldRemain0() {
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }
}