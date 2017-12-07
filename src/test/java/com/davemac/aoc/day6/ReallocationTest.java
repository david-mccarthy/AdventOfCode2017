package com.davemac.aoc.day6;

import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ReallocationTest {
    private static final String DIRECTORY = "src/test/data/day6/";
    private static final String FILE = "input";
    private static final String TEST_FILE = "testInput";

    @Test
    public void test6a() {
        File input = new File(DIRECTORY + TEST_FILE);
        assert (Reallocation.solve6a(input) == 5);
    }

    @Test
    public void getSolutions() {
        System.out.println(Reallocation.solve6a(new File(DIRECTORY + FILE)));
    }

    @Test
    public void testHash() {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            m.put(i, i + 10);
        }

        String hash = Reallocation.generateSimpleHash(m);
        System.out.println(hash);
    }
}