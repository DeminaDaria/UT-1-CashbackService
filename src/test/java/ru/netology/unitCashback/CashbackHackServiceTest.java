package ru.netology.unitCashback;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldAmountMoreBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountLessBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountEqualsBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = hackService.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
