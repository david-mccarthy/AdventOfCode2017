package com.davemac.aoc.day3;

import java.util.ArrayList;
import java.util.List;

public class SpiralMemory {

    public static int solve3a(int input) {

        if (input == 1) {
            return 0;
        }
        int spiral = 0;
        int spiralSize = -1;
        int corner = Integer.MIN_VALUE;
        for (int i = 1; i <= input; i += 2) {
            spiral++;
            spiralSize += 2;
            if (i * i >= input) {
                corner = i * i;
                break;
            }
        }

        boolean found = false;
        List<Integer> edgeValues = new ArrayList<>();
        //Generate each edge, 1 at a time until we find the number.
        while (!found) {
            edgeValues = generateEdgeValues(spiralSize, corner);
            if (edgeValues.contains(input)) {
                found = true;
            } else {
                corner = edgeValues.get(0);
            }
        }
        int stepsToMiddle = countStepsToMiddle(edgeValues, input);
        return stepsToMiddle + (spiral - 1);
    }

    private static List<Integer> generateEdgeValues(int size, int init) {
        List<Integer> values = new ArrayList<>();

        for (int i = size - 1; i >= 0; i--) {
            values.add(init - i);
        }

        return values;
    }

    private static int countStepsToMiddle(List<Integer> values, int val) {
        int position = values.indexOf(val) + 1;
        int middle = ((values.size() - 1) / 2) + 1;

        return Math.abs(position - middle);
    }
}
