package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public  class CashbackHackServiceTest {
    @Test
    void shouldReturnCashback(){

CashbackHackService service = new CashbackHackService();
//int amount = 2000;
int expected = 1000;
int actual = service.remain(2000);


assertEquals(expected, actual);
    }
}