public class SingleDimArrays {
//    public static void main(String[] args) {
    //       double[] myList = new double[10];

    //        myList[0] = 1.1;
//        myList[1] = 2.2;
//        myList[2] = 3.3;
//
//        System.out.printf("The array length is: %d\n", myList.length);
//        System.out.printf("The first element is: %.2f\n", myList[0]);
//        System.out.printf("The list element is: %.2f\n", myList[9]);
// Array initializers
//        double[] myList = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
//        String[] cities = { "Nibley", "Logan", "Hyde Park", " Smithfield" };
//
//        System.out.printf("The first in each array is: %.2f %s\n", myList[0], cities[0]);
//
//        System.out.printf("The size of each arry is: %d %d\n", myList.length, cities.length);
//
//        myList = new double[10];
//
//        double[] myList = new double[10];
//
//        for (int i = 0; i < myList.length; i++) {
//            myList[i] = Math.random() * 100;
//
//        }
//
//        double total = 0;
//        for (int i = 0; i < myList.length; i++) {
//            total += myList[i];
//        }
//            System.out.printf("Total of all elements: %.2f\n", total);
//        double total2 = 0;
//        for (double v : myList) {
//            total2 += v;
//        }
//        System.out.printf("Total of all the elements: %.2f\n", total2);
//COPYING ARRAYS
//        int[] myList1 = {1, 1, 2, 3, 5, 8, 13, 21};
//        reportArray(myList1);
//        int[] myList2 = new int[myList1.length];
//        reportArray(myList2);
//
//        for (int i = 0; i < myList1.length; i++) {
//            myList2[i] = myList1[i];
//
//        }
//        myList1[4] = 44;
//        reportArray(myList1);
//        reportArray(myList2);
//
//        int[] myList3 = new int[myList1.length];
//        System.arraycopy(myList1,  0, myList3, 0, myList1.length);
//        System.out.println("Using System.arraycopy");
//        reportArray(myList3);
//    }
//    public static void reportArray(int[] array){
//        for (int v: array) {
//            System.out.printf("%d ", v);
//        }
//        System.out.println();
// Arrays and METHODS
//    public static void main(String[] args) {
//        int[] myList1 = {1, 1, 2, 3, 5, 8, 13, 21};
//        reportArray(myList1);
//        doubleArray(myList1);
//        reportArray(myList1);
//    }
//
//    public static void reportArray(int[] array) {
//        for (int v : array) {
//            System.out.printf("%d ", v);
//        }
//        System.out.println();
//    }
//
//    public static void doubleArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i] * 2;
//        }
//RETURNING AND ARRAY FROM A METHOD
    public static void main(String[] args) {
        int[] mylist = createArray(10, 4);
        //reportArray(mylist);

        int[] myList2 = { 1, 1, 2, 3, 5, 8, 13 , 21};
        int[] myList2r = reverseArray(myList2);
        reportArray(myList2);
        reportArray(myList2r);
    }

    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reverse[j] = array[i];

        }
        return reverse;
    }

    public static int[] createArray(int howMany, int fill) {
        int[] array = new int[howMany];
        for (int i = 0; i < array.length; i++) {
            array[i] = fill;
        }
        return array;

    }

    public static void reportArray(int[] array) {
        for (int v : array) {
            System.out.printf("%d ", v);
        }
            System.out.println();

    }
}

