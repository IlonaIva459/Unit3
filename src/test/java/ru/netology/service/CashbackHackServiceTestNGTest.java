package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTestNGTest {
    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100WhenAmountIs900() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0WhenAmountIs1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999WhenAmountIs1() {
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0WhenAmountIs2000() {
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    // Тест, который выявит ошибку
    @Test
    public void shouldReturn0WhenAmountIs0() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}