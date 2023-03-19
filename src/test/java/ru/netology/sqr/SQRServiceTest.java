package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    public void shouldCalc1() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200, 289);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalc2() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(225, 300);
        assertEquals(expected, actual);
    }
}

