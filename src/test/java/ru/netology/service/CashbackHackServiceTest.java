package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class CashbackHackServiceTest {
    @Test
    void shouldReturnCashback(){

CashbackHackService service = new CashbackHackService();
//int amount = 2000;
int expected = 0;
int actual = service.remain(1000);


assertEquals(expected, actual);
    }
}
