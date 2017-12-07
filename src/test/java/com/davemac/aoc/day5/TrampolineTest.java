package com.davemac.aoc.day5;

import org.junit.Test;

import java.io.File;

public class TrampolineTest {
    private static final String INPUT_DIR = "src/test/data/day5/";
    private static final String INPUT_FILE = "input";
    private static final String TEST_INPUT_FILE = "testInput";

    @Test
    public void solve5a() throws Exception {

        System.out.println("Puzzle 5a: " + Trampoline.solve5a(new File(INPUT_DIR + INPUT_FILE)));
        System.out.println("Puzzle 5b: " + Trampoline.solve5b(new File(INPUT_DIR + INPUT_FILE)));
    }


    @Test
    public void test(){

        assert(Trampoline.solve5a(new File(INPUT_DIR + TEST_INPUT_FILE)) == 5);
        assert(Trampoline.solve5b(new File(INPUT_DIR + TEST_INPUT_FILE)) == 10);
    }
}