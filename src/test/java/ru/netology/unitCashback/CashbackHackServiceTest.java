package ru.netology.unitCashback;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldAmountMoreBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        assertEquals(999, hackService.remain(1001));
    }

    @Test
    public void shouldAmountLessBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        assertEquals(100, hackService.remain(900));
    }

    @Test
    public void shouldAmountEqualsBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        assertEquals(0, hackService.remain(1000));
    }
}
