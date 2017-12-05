package com.davemac.aoc.day4;

import com.davemac.aoc.utils.FileUtils;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class PassphraseTest {
    private static final String TEST_PATH = "src/test/data/day4/";
    private static final String FILE_NAME = "input";

    @Test
    public void test4a() {
        System.out.println(Passphrase.solve4a(TEST_PATH + FILE_NAME));
        System.out.println(Passphrase.solve4b(TEST_PATH + FILE_NAME));
    }

}