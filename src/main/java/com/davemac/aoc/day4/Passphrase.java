package com.davemac.aoc.day4;

import com.davemac.aoc.utils.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Passphrase {

    public static int solve4a(String path) {
        File file = new File(path);
        return countValidPassphrases(file);
    }

    public static int solve4b(String path) {
        File file = new File(path);
        return countValidPassphrases4b(file);
    }

    private static int countValidPassphrases(File file) {
        Scanner scanner = FileUtils.getScanner(file);
        int count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s");
            List<String> listOfWords = new ArrayList<>();
            boolean found = false;
            for (String word : words) {
                if (listOfWords.contains(word)) {
                    found = true;
                    break;
                } else {
                    listOfWords.add(word);
                }
            }
            if (!found) {
                count++;
            }
        }
        return count;
    }

    private static int countValidPassphrases4b(File file) {
        Scanner scanner = FileUtils.getScanner(file);
        int count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s");
            List<String> listOfWords = new ArrayList<>();
            boolean found = false;
            for (String word : words) {
                if (existsOrAnagramExists(listOfWords, word)) {
                    found = true;
                    break;
                } else {
                    listOfWords.add(word);
                }
            }
            if (!found) {
                count++;
            }
        }
        return count;
    }

    private static boolean existsOrAnagramExists(List<String> list, String word) {
        List<String> wordChars = Arrays.asList(word.split(""));
        for (String item : list) {
            if (item.equals(word)) {
                return true;
            }
            List<String> itemChars = Arrays.asList(item.split(""));
            if (itemChars.size() == wordChars.size() && itemChars.containsAll(wordChars)) {
                return true;
            }
        }
        return false;
    }

}