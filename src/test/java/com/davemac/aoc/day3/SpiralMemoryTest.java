package com.davemac.aoc.day3;

import org.junit.Test;

public class SpiralMemoryTest {
    @Test
    public void testSolve3a() throws Exception {

        assert (SpiralMemory.solve3a(1) == 0);
        assert (SpiralMemory.solve3a(12) == 3);
        assert (SpiralMemory.solve3a(23) == 2);
        assert (SpiralMemory.solve3a(1024) == 31);
    }

    @Test
    public void getSolution() {
        System.out.println("3a solution: " + SpiralMemory.solve3a(325489));
    }
}