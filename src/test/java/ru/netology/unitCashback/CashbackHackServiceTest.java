package ru.netology.unitCashback;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldAmountMoreBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = 999;
        int expected = hackService.remain(1001);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountLessBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        int actual = 100;
        int expected = hackService.remain(900);

        assertEquals(actual, expected);
    }
}
