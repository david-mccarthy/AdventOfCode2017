package com.davemac.aoc.day2;

import com.davemac.aoc.utils.FileUtils;

import java.io.File;
import java.util.Scanner;

class CorruptionChecksum {

    /**
     * Puzzle 2a
     * @param file file input
     * @return int
     */
    public static int solveChecksum2a(File file) {

        int checksum = 0;
        Scanner scanner = FileUtils.getScanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] nums = line.split("\\s");
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            for (String num : nums) {
                int n = Integer.parseInt(num);
                if (n > largest) {
                    largest = n;
                }
                if (n < smallest) {
                    smallest = n;
                }
            }
            checksum += largest - smallest;
        }
        return checksum;
    }

    /**
     * Puzzle 2b
     * @param file file input
     * @return int
     */
    public static int solveChecksum2b(File file) {

        int checksum = 0;
        Scanner scanner = FileUtils.getScanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] nums = line.split("\\s");
            checksum += getLineTotal(nums);
        }
        return checksum;
    }

    private static int getLineTotal(String[] nums) {
        int lineTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = Integer.parseInt(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int n2 = Integer.parseInt(nums[j]);
                    if (n != n2 && n % n2 == 0) {
                        lineTotal += n / n2;
                    }
                }
            }
        }
        return lineTotal;
    }
}
