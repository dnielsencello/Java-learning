public class MultiArray {
    public static void main(String[] args) {
        int[][] square = new int[5][5];

        fillArray(square, 1);
        printArray(square);
    }

    public static void printArray(int[][] data) {
        for (int[] row : data) {
            for (int value : row) {
                System.out.printf("%2d ", value);
            }
            System.out.println();
        }
    }

    public static void fillArray(int[][] data, int fillValue) {
        // initialize the array
//        int fillValue = 1;
//        for (int i = 0; i < square.length; i++) {
//            for (int j = 0; j < square[i].length; j++) {
//                square[i][j] = fillValue;
//            }
//            fillValue++;
//        }

        for (int[] row : data) {
            for (int j = 0; j < row.length; j++) {
                row[j] = fillValue;
            }
            fillValue++;
        }

        // This is an incorrect technique for filling the array
//        for (int[] row : square) {
//            for (int value : row) {
//                value = fillValue;
//            }
//            fillValue++;
//        }

    }
}