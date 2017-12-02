package com.davemac.aoc.day1;

class Captcha {

    private static int solve(String input, Integer compare) {

        String[] nums = input.split("");
        int total = 0;
        int size = nums.length;
        int listPositionForComparison;
        if (compare != null) {
            listPositionForComparison = size / compare;
        } else {
            listPositionForComparison = 1;
        }

        int i = 0;
        while (i < size) {
            String thisNum = nums[i];
            String nextNum = nums[(i + listPositionForComparison) % size];
            if (thisNum.equals(nextNum)) {
                total += Integer.parseInt(thisNum);
            }
            i++;
        }
        return total;
    }

    public static int solveDay1a(String input) {
        return solve(input, null);
    }

    public static int solveDay1b(String input) {
        return solve(input, 2);
    }
}
