package com.davemac.aoc.day5;

import com.davemac.aoc.utils.FileUtils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Trampoline {

    public static int solve5a(File file) {

        Scanner scanner = FileUtils.getScanner(file);
        Map<Integer, Integer> input = new HashMap<>();
        int i = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            input.put(i, Integer.parseInt(line));
            i++;
        }

        return solvePuzzle(input, Integer.MAX_VALUE);
    }

    public static int solve5b(File file) {

        Scanner scanner = FileUtils.getScanner(file);
        Map<Integer, Integer> input = new HashMap<>();
        int i = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            input.put(i, Integer.parseInt(line));
            i++;
        }

        return solvePuzzle(input, 3);
    }

    private static int solvePuzzle(Map<Integer, Integer> input, int greaterThan) {
        int index = 0;
        int steps = 0;
        boolean escaped = false;

        while (!escaped) {
            try {
                int jumps = input.get(index);
                if (jumps >= greaterThan) {
                    input.put(index, jumps - 1);
                } else {
                    input.put(index, jumps + 1);
                }
                index += jumps;
                steps++;
            } catch (NullPointerException e) {
                escaped = true;
            }
        }
        return steps;
    }
}
