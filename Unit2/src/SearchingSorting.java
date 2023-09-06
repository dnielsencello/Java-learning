public class SearchingSorting {
    public static void main(String[] args) {
        //int[] data = { 1, 2, 3, 5, 8, 13, 21, 34, 55};
        int[] data = {4, 2, 88, 42, 56, 22, 8, 38};
//        bubbleSort(data);
        selectionSort(data);
        report(data);
        if (binarySearch(data, 22)) {
            System.out.println("Found the value");

        } else {
            System.out.println("Did not find the value");

        }
    }


    //        if (linearSearch(data, 13)) {
//            System.out.println("Found 84");
//        } else {
//            System.out.println("Did not find 84");
//        }
//
//        int searchFor = -20;
//        if (binarySearch(data, searchFor)) {
//            System.out.printf("Found %d\n", searchFor);
//        } else {
//            System.out.printf("Did not find %d\n", searchFor);
//        }
//    }
//
    public static void report(int[] array) {
        for (int v : array) {
            System.out.printf("%d ", v);
        }
        System.out.println();

    }

    // SELECTION SORT
    public static void selectionSort(int[] array) {
        for (int start = 0; start < array.length - 1; start++) {
            int minPos = start;
            for (int scan = start + 1; scan < array.length; scan++) {
                if (array[scan] < array[minPos]) {
                    minPos = scan;
                }
            }
            int temp = array[start];
            array[start] = array[minPos];
            array[minPos] = temp;
        }
    }

    // BUBBLE SORT
    public static void bubbleSort(int[] array) {
        boolean didSwap = false;
        do {
            didSwap = false;
            for (int item = 0; item < array.length - 1; item++) {
                if (array[item] > array[item + 1]) {
                    int temp = array[item];
                    array[item] = array[item + 1];
                    array[item + 1] = temp;
                    didSwap = true;

                }
            }

        } while (didSwap);
    }

    //BINARY SEARCH
    public static boolean binarySearch(int[] array, int search) {
        int lower = 0;
        int upper = array.length - 1;

        boolean found = false;
        while (!found && lower <= upper) {
            int middle = (lower + upper) / 2;
            if (array[middle] == search) {
                found = true;

            }
            if (array[middle] < search) {
                lower = middle + 1;
            } else {
                upper = middle - 1;
            }

        }

        return found;
    }

    //LINEAR SEARCH
    public static boolean linearSearch(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return true;
            }
        }
        return false;
    }
}
