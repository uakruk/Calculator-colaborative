package com.hillel.javaintroduction.homework5;

import java.util.Arrays;

public class JavaMethod {

    // 1. Минимальный метод
    public static int min(int a, int b) {
        int min = 0;
        if (a < b) {
            min = a;
        } else if (a == b) {
            System.out.println("There is no minimal number");
            ;
        } else {
            min = b;
        }

        return min;

    }

    public static String minUsingTernary(int a, int b) {

        String min = a < b ? "a" : a == b ? "There is no minimal number" : "b";

        return min;
    }

    // 2. Максимальный метод
    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else if (a == b) {
            System.out.println("There is no maximal number");
        } else {
            max = b;
        }
        return max;
        }

    public static String maxUsingTernary ( int a, int b){

        String max = a > b ? "a" : a == b ? "There is no minimal number" : "b";

        return max;

        }
// 3.
    public static int EndSentenceIndex (String paragraphText, int searchFromIndex) {

        int endIndex = 0;

        int indexPoint = paragraphText.indexOf(".", searchFromIndex);
        int indexQuestion = paragraphText.indexOf("?", searchFromIndex);
        int indexExclamation = paragraphText.indexOf("!", searchFromIndex);

        if (indexPoint < indexQuestion || indexPoint < indexExclamation || indexPoint != -1) {
            endIndex = indexPoint;
        }
        if (indexQuestion < indexPoint || indexQuestion < indexExclamation || indexQuestion != -1) {
            endIndex = indexQuestion;
        }
        if (indexExclamation < indexPoint || indexExclamation < indexQuestion || indexExclamation != -1) {
            endIndex = indexExclamation;
        }
        return endIndex;
    }
// 4.
      public static int CountOfSentences (String paragraph) {

        int numberOfSentences = 0;

        for (int i = 0; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) = paragraph.equals('.') || paragraph.charAt(i) = paragraph.equals('?')) paragraph.charAt(i) = paragraph.equals('!') {
                numberOfSentences++;
            }
        }
          return numberOfSentences;
      }

// 5.
    public void SentenceFromParagraph (String paragraph) {

        String[] sentences = paragraph.split("[.?!]//s*");

        System.out.println(sentences);
    }
}
