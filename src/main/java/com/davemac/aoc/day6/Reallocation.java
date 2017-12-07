package com.davemac.aoc.day6;

import com.davemac.aoc.utils.FileUtils;

import java.io.File;
import java.util.*;

public class Reallocation {

    public static int solve6a(File input) {

        Scanner scanner = FileUtils.getScanner(input);
        // This puzzle input is all on one line
        String line = scanner.nextLine();
        String[] strInput = line.split("\\s");
        Map<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i < strInput.length; i++) {
            nums.put(i, Integer.parseInt(strInput[i]));
        }

        int index = 0;
        String hash = "ABCDEG";
        List<String> hashes = new ArrayList<>();

        int steps = 0;
        while (!hashes.contains(hash)) {
            hashes.add(hash);
            index = getStartingPoint(nums);
            int val = nums.get(index);
            nums.put(index, 0);
            for (int i = 1; i <= val; i++) {
                index++;
                int idx = index % nums.size();
                nums.put(idx, nums.get(idx) + 1);
            }
            hash = generateSimpleHash(nums);

            steps++;
        }
        System.out.println("Cycles: " + (steps - hashes.indexOf(hash)));
        return steps;
    }


    protected static String generateSimpleHash(Map<Integer, Integer> map) {
        String hash = "";
        return map.toString();
    }

    private static int getStartingPoint(Map<Integer, Integer> map) {
        int largest = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) > largest) {
                largest = map.get(i);
                idx = i;
            }
        }
        return idx;
    }
}



