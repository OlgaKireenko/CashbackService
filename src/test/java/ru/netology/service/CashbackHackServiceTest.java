package ru.netology.service;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public  class CashbackHackServiceTest {
   @Test

public void shouldCountCashback1(){
       CashbackHackService service = new CashbackHackService();


       int expected = 100;
       int actual = service.remain(900);
       assertEquals(actual, expected);
   }

    @Test

    public void shouldCountCashback2(){
        CashbackHackService service = new CashbackHackService();


        int expected = 1000;
        int actual = service.remain(10000);
        assertEquals(actual, expected);
    }

    @Test

    public void shouldCountCashback3(){
        CashbackHackService service = new CashbackHackService();


        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
}
