import java.util.Arrays;

/**
 * Assignment 4 for CS 1410
 * This program evaluates the linear and binary searching, along
 * with comparing performance difference between the selection sort
 * and the built-in java.util.Arrays.sort.
 *
 * @author James Dean Mathias
 */


public class EvaluationDriver {
    static final int MAX_VALUE = 1_000_000;
    static final int MAX_ARRAY_SIZE = 100_000;
    static final int ARRAY_INCREMENT = 20_000;
    static final int NUMBER_SEARCHES = 50_000;
    public static void main(String[] args) {

        demoLinearSearchUnsorted();
        demoLinearSearchSorted();
        demoBinarySearchSelectionSort();
        demoBinarySearchFastSort();
    }
    public static void demoLinearSearchUnsorted() {
        System.out.println("--- Linear Search Timing (unsorted) ---");
        for (int howMany = ARRAY_INCREMENT; howMany <= MAX_ARRAY_SIZE; howMany += ARRAY_INCREMENT) {
            int[] myArray = generateNumbers(howMany, MAX_VALUE);
            assert myArray != null;
            double totalTime = 0;
            long start = System.currentTimeMillis();
            int foundValue = 0;
            for (int j = 0; j <= NUMBER_SEARCHES; j++) {
                double search = Math.random() * MAX_VALUE;
                if (linearSearch(myArray, search)) {
                    foundValue += 1;
                } else foundValue += 0;
            }
            long end = System.currentTimeMillis();
            totalTime += (end - start);

            reportTiming(howMany, foundValue, totalTime);
        }

    }
    public static void demoLinearSearchSorted(){
        System.out.println("--- Linear Search Timing (Selection sort) ---");
        for (int howMany = ARRAY_INCREMENT; howMany <= MAX_ARRAY_SIZE; howMany += ARRAY_INCREMENT) {
            int[] myArray = generateNumbers(howMany, MAX_VALUE);
            assert myArray != null;
            double totalTime = 0;
            long start = System.currentTimeMillis();
            int foundValue = 0;
            int[] myArraySorted = selectionSort(myArray);
            for (int j = 0; j <= NUMBER_SEARCHES; j++) {
                double search = Math.random() * MAX_VALUE;
                if (linearSearch(myArraySorted, search)) {
                    foundValue += 1;
                } else foundValue += 0;
            }
            long end = System.currentTimeMillis();
            totalTime += (end - start);
            reportTiming(howMany, foundValue, totalTime);
        }

    }
    public static void demoBinarySearchSelectionSort(){
        System.out.println("--- Binary Search Timing (Selection Sort) ---");
        for (int howMany = ARRAY_INCREMENT; howMany <= MAX_ARRAY_SIZE; howMany += ARRAY_INCREMENT) {
            int[] myArray = generateNumbers(howMany, MAX_VALUE);
            assert myArray != null;
            double totalTime = 0;
            long start = System.currentTimeMillis();
            int foundValue = 0;
            int[] myArraySorted = selectionSort(myArray);
            for (int j = 0; j <= NUMBER_SEARCHES; j++) {
                double search = Math.random() * MAX_VALUE;
                if (binarySearch(myArraySorted, search)) {
                    foundValue += 1;
                } else foundValue += 0;
            }
            long end = System.currentTimeMillis();
            totalTime += (end - start);
            reportTiming(howMany, foundValue, totalTime);
        }
    }
    public static void demoBinarySearchFastSort(){
        System.out.println("--- Binary Search Timing (Array.sort) ---");
        for (int howMany = ARRAY_INCREMENT; howMany <= MAX_ARRAY_SIZE; howMany += ARRAY_INCREMENT) {
            int[] myArray = generateNumbers(howMany, MAX_VALUE);
            assert myArray != null;
            double totalTime = 0;
            long start = System.currentTimeMillis();
            int foundValue = 0;
            Arrays.sort(myArray);
            for (int j = 0; j <= NUMBER_SEARCHES; j++) {
                double search = Math.random() * MAX_VALUE;
                if (binarySearch(myArray, search)) {
                    foundValue += 1;
                } else foundValue += 0;
            }
            long end = System.currentTimeMillis();
            totalTime += (end - start);
            reportTiming(howMany, foundValue, totalTime);
        }
    }
    public static int[] generateNumbers(int howMany, int maxValue) {

        if (howMany > MAX_ARRAY_SIZE || howMany <= 0){
            return null;
        }else {
            int[] myArray = new int[howMany];
            for (int i = 0; i < howMany; i++) {
                myArray[i] = (int) (Math.random() * maxValue);
            }
            return myArray;
        }
    }
    public static int[] selectionSort(int[] array) {
        for(int start = 0; start < array.length - 1; start++) {
            int minPos = start;
            for (int scan = start + 1; scan < array.length; scan++) {
                if(array[scan] < array[minPos]) {
                    minPos = scan;
                }
            }
            int temp = array[start];
            array[start] = array[minPos];
            array[minPos] = temp;
        }
        return array;
    }
    public static boolean binarySearch(int[] array, double search) {
        int lower = 0;
        int upper = array.length - 1;

        boolean found = false;
        while (!found && lower <= upper) {
            int middle = (lower + upper) / 2;
            if (array[middle] == (int) search) {
                found = true;

            } if (array[middle] < search) {
                lower = middle + 1;
            } else {
                upper = middle - 1;
            }

        }

        return found;
    }
    public static boolean linearSearch(int[] array, double search) {

        for (int j : array) {
            if (j == (int) search) {
                return true;

            }
        }
        return false;
    }
    public static void reportTiming(int howMany, int foundValue, double totalTime) {
        System.out.printf("Number of items       : %d\n", howMany);
        System.out.printf("Times value was found : %d\n", foundValue);
        System.out.printf("Total Search Time     : %.0f ms\n\n", totalTime);

    }



}
