package com.davemac.aoc.day2;

import org.junit.Test;

import java.io.File;


public class CorruptionChecksumTest {

    private static final String TEST_DIR = "src/test/data/day2/";

    @Test
    public void testChecksum2a() {
        assert (CorruptionChecksum.solveChecksum2a(new File(TEST_DIR + "sample2a")) == 18);
    }

    @Test
    public void testChecksum2b() {
        assert (CorruptionChecksum.solveChecksum2b(new File(TEST_DIR + "sample2b")) == 9);
    }

    @Test
    public void getSolutions() {
        System.out.println("2a solution: " + CorruptionChecksum.solveChecksum2a(new File(TEST_DIR + "input")));
        System.out.println("2b solution: " + CorruptionChecksum.solveChecksum2b(new File(TEST_DIR + "input")));
    }
}