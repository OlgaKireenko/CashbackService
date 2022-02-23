package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldReturnCashback1() {
        CashbackHackService service = new CashbackHackService();


        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturnCashback2() {
        CashbackHackService service = new CashbackHackService();


        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturnCashback3() {
        CashbackHackService service = new CashbackHackService();


        int expected = 1000;
        int actual = service.remain(10000);
        assertEquals(actual, expected);

    }


}
