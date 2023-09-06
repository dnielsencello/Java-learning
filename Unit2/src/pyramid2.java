import java.util.Scanner;
public class pyramid2 {
    public static void main(String[] args) {

//        int[] myList = createArray();
// User inputs the number of rows in the pyramid

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Input the number of lines: ");
        int lengthOfList = input.nextInt();
        int lengthOfLongestNumber = Integer.toString((int) Math.pow(2, lengthOfList)).length()+1;
        int numStr = 0;
        for (int t = 0; t < lengthOfList; t++) {
            numStr += 1;
            for (int s = 0; s < lengthOfList - numStr; s++) {
                for (int u = 0; u < lengthOfLongestNumber; u++) {
                       System.out.print(" ");
                }

            }
            int[] myList = createArray(numStr, 0);
            reportArray(myList, lengthOfLongestNumber);
        }


    }
    // a list of with the number of elements in the list is created
// the amount of space the each number will be required to take is calculated
//
//
// if it is the first row for if the number is
//
//
//
    public static void reportArray(int[] array, int lengthOfLongestNumber) {
        for (int v : array) {
            System.out.printf("%" + lengthOfLongestNumber  + "d", v);
        }
        System.out.println();
        }


//        for (int i = 0; i < lengthOfList; i++) {
//            for (int w : array) {
//                if (array[i]-2 < array[w]){
//                    System.out.printf("%"+ lengthOfLongestNumber + "d", w);
//                }else {
//                    for (int u = 0; u < lengthOfLongestNumber; u++) {
//                        System.out.print(" ");
//
//                    }
//
//                }
//
//            }
//            System.out.println();



    public static int[] createArray(int howMany, int fill) {
        int[] array = new int[howMany * 2 - 1];

        for (int j = 0; j < array.length/2 + 1; j++) {
            array[j] = (int) Math.pow(2, j);
        }
        for (int i = 0; i < array.length/2; i++) {
            int reverse = howMany*2 - i;

            array[i + array.length/2 + 1] = (int) Math.pow(2, howMany - i -2);
        }

        return array;
//
//
//
//


    }


}
