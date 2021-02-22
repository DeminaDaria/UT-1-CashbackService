package ru.netology.unitCashback;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceApiJunitJupiterTest {

    @Test
    void shouldAmountMoreBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        assertEquals(999, hackService.remain(1001));
    }

    @Test
    void shouldAmountLessBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        assertEquals(100, hackService.remain(900));
    }

    @Test
    void shouldAmountEqualsBoundary() {
        CashbackHackService hackService = new CashbackHackService();

        assertEquals(0, hackService.remain(1000));
    }
}
