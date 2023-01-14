package ru.netology;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 700;
        int actual = service.remain(2300);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldNoAdviseThanAmountEqualsThousand(){
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdviseThanAmountBeforeThousand(){
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(500);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldAdviseThenAmountNotRound() {
        CashbackHackService service = new CashbackHackService();
        int expected = 436;
        int actual = service.remain(1564);
        assertEquals(actual, expected);
    }


}