package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordCounterTest {

    BalancedWordCounter balancedWordCounter = new BalancedWordCounter();

    @Test
    void shouldReturn28(){
        //given
        Integer result;
        //when
        result = balancedWordCounter.count("aabbabcccba");
        //then
        assertEquals(result, 28);
    }

    @Test
    void shouldReturn0(){
        //given
        Integer result;
        //when
        result = balancedWordCounter.count("");
        //then
        assertEquals(result, 0);
    }

    @Test
    void shouldThrowExceptionIfInputIsNotAlpha(){
        //given
        //when
        //then
        assertThrows(RuntimeException.class, () -> balancedWordCounter.count("abababa1"));
    }

    @Test
    void shouldThrowExceptionIfInputIsNull(){
        //given
        //when
        //then
        assertThrows(RuntimeException.class, () -> balancedWordCounter.count(null));
    }

}