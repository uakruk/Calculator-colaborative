package com.hillel.javaintroduction.homework8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

    public class HomeAssignment {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the desired array length: ");
            int arrayLength = scanner.nextInt();

            int[] array = new int[arrayLength];

            System.out.printf("Filling the array of length %d with random numbers\n", arrayLength);
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }

            System.out.println("Array before sort: ");
            System.out.println(Arrays.toString(array));

            // saving the original array for the next sorting algorithm
            int[] arrayCopy = Arrays.copyOf(array, array.length);
            int[] arraySecondCopy = Arrays.copyOf(array, array.length);

            // here your code, output the average, min, max values

            getAverageValue(array);

            getMaximumValue(array);

            getMinimumValue(array);


            // ... your code...

            // don't modify this
            performSortingAndMeasureTime(array, HomeAssignment::bubbleSort, "Bubble"); // just for example
            performSortingAndMeasureTime(arrayCopy, HomeAssignment::mergeSort, "Merge");
            performSortingAndMeasureTime(arraySecondCopy, HomeAssignment::quickSort, "Quicksort");

            int[][] matrix = new int[8][6]; // you can change the size of the matrix for whatever you want
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = random.nextInt(20);
                }
            }

            System.out.println("\n\n");
            System.out.println("The input matrix is:");
            printMatrix(matrix);

            System.out.println("Transposing the matrix...");
            transposeMatrix(matrix);

            System.out.println("The result is:");
            printMatrix(matrix);

        }



        // DO NOT MODIFY THIS METHOD
        public static void performSortingAndMeasureTime(int[] array, Consumer<int[]> sortFunction, String sortType) {

            System.out.println("Starting " + sortType + " sort...");
            long startedSorting = System.nanoTime();
            sortFunction.accept(array);
            long endSorting = System.nanoTime();

            long duration = endSorting - startedSorting;

            long secondsTook = TimeUnit.NANOSECONDS.toSeconds(duration);
            long secondsInNanos = TimeUnit.SECONDS.toNanos(secondsTook);

            long millisTook = TimeUnit.NANOSECONDS.toMillis(duration - secondsInNanos);
            long millisInNanos = TimeUnit.MILLISECONDS.toNanos(millisTook);

            long microsTook = TimeUnit.NANOSECONDS.toMicros(duration - secondsInNanos - millisInNanos);
            long microsInNanos = TimeUnit.MICROSECONDS.toNanos(microsTook);

            long nanosTook = duration - secondsInNanos - millisInNanos - microsInNanos;
            System.out.printf("%s sort has finished. It took %d seconds %d millis %d micros and %d nanos\n", sortType, secondsTook, millisTook, microsTook, nanosTook);
            System.out.println("The results are:");
            System.out.println(Arrays.toString(array));
            System.out.println();
        }

        public static double getAverageValue(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            double average = sum / array.length;
            System.out.println("Average value = " + average);
            return 0;
        }

        public static int getMaximumValue(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
                System.out.println("The biggest value = " + max);

            return 0;
        }

        public static int getMinimumValue(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
                System.out.println("The smallest value = " + min);


            return 0;
        }

         public static void mergeSort( int[] inputArray, int n) {



                if (n < 2) {
                    return;
                }
                int mid = n / 2;
                int[] l = new int[mid];
                int[] r = new int[n - mid];

                for (int i = 0; i < mid; i++) {
                    l[i] = inputArray[i];
                }
                for (int i = mid; i < n; i++) {
                    r[i - mid] = inputArray[i];
                }
                mergeSort(l, mid);
                mergeSort(r, n - mid);

                merge(inputArray, l, r, mid, n - mid);
            }
        public static void merge(int[] a, int[] l, int[] r, int left, int right) {

            int i = 0, j = 0, k = 0;
            while (i < left && j < right) {
                if (l[i] <= r[j]) {
                    a[k++] = l[i++];
                }
                else {
                    a[k++] = r[j++];
                }
            }
            while (i < left) {
                a[k++] = l[i++];
            }
            while (j < right) {
                a[k++] = r[j++];
            }
        }






        public static void quickSort( int[] inputArray, int low, int high) {



            if (inputArray.length == 0)
                    return;

            if (low >= high)
                    return;


            int middle = low + (high - low) / 2;
            int opora = inputArray[middle];


            int i = low, j = high;
            while (i <= j) {
                while (inputArray[i] < opora) {
                    i++;
                }

                while (inputArray[j] > opora) {
                    j--;
                }

                if (i <= j) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                    i++;
                    j--;
                }
            }


            if (low < j)
                quickSort(inputArray, low, j);

            if (high > i)
                quickSort(inputArray, i, high);
            }



            public static void bubbleSort( int[] array){
                int arrayLength = array.length;

                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < arrayLength - 1; j++) {
                        int first = array[j];
                        int second = array[j + 1];

                        if (first > second) {
                            array[j] = second;
                            array[j + 1] = first;
                        }
                    }
                    arrayLength--;
                }
            }

            public static int[][] transposeMatrix(int[][] matrix) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = i + 1; j < matrix[i].length; j++) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;
                    }
                }
                System.out.println();
                System.out.println("New matrix");
                System.out.println("------");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.printf("%3d", matrix[i][j]);
                    }
                    System.out.println();
                }
                return null;
            }

            public static void printMatrix ( int[][] matrix){
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.printf("%3d", "| " + matrix[i][j] + " |");
                    }
                    System.out.println();
                }
            }
        }


