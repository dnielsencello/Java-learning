import java.util.Arrays;
import java.util.Locale;

public class Recursion {
    public static void main(String[] args) {

        int[] sumMe = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        System.out.printf("Array Sum: %d\n", arraySum(sumMe, 0));

        int[] minMe = { 0, 1, 1, 2, 3, 5, 8, -42, 13, 21, 34, 55, 89 };
        System.out.printf("Array Min: %d\n", arrayMin(minMe, 0));

        String[] amISymmetric =  {
                "You can cage a swallow can't you but you can't swallow a cage can you",
                "I still say cS 1410 is my favorite class"
        };

        for (String test : amISymmetric) {
            String[] words = test.toLowerCase().split(" ");
            System.out.println();
            System.out.println(test);
            System.out.printf("Is word symmetric: %b\n", isWordSymmetric(words, 0, words.length - 1));
        }

        double weights[][] = {
                { 51.18 },
                { 55.90, 131.25 },
                { 69.05, 133.66, 132.82 },
                { 53.43, 139.61, 134.06, 121.63 }
        };
        System.out.println();
        System.out.println("--- Weight Pyramid ---");
        for (int row = 0; row < weights.length; row++) {
            for (int column = 0; column < weights[row].length; column++) {
                double weight = computePyramidWeights(weights, row, column);
                System.out.printf("%.2f ", weight);
            }
            System.out.println();
        }

        char image[][] = {
                {'*','*',' ',' ',' ',' ',' ',' ','*',' '},
                {' ','*',' ',' ',' ',' ',' ',' ','*',' '},
                {' ',' ',' ',' ',' ',' ','*','*',' ',' '},
                {' ','*',' ',' ','*','*','*',' ',' ',' '},
                {' ','*','*',' ','*',' ','*',' ','*',' '},
                {' ','*','*',' ','*','*','*','*','*','*'},
                {' ',' ',' ',' ',' ',' ',' ',' ','*',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ','*',' '},
                {' ',' ',' ','*','*','*',' ',' ','*',' '},
                {' ',' ',' ',' ',' ','*',' ',' ','*',' '}
        };
        int howMany = howManyOrganisms(image);
        System.out.println();
        System.out.println("--- Labeled Organism Image ---");
        for (char[] line : image) {
            for (char item : line) {
                System.out.print(item);
            }
            System.out.println();
        }
        System.out.printf("There are %d organisms in the image.\n", howMany);

    }
    public static long arraySum(int[] data, int position){
        if (position == data.length || data.length == 0) {
            return 0;
        }
        return data[position] + arraySum(data, position+ 1);
    }
    public static int arrayMin(int[] data, int position) {
        if(position == data.length-1)  {
            return data[position];
        }
        int mini = arrayMin(data, position + 1);

        if (data[position] < mini) {
            return data[position];
        } else {
            return mini;
        }

    }
    public static boolean isWordSymmetric(String[] words, int start, int end) {
        if (words.length == 0) {
            return true;
        }
        if (start >= end) {
            return true;
        }
        if (words[start].toLowerCase().equals(words[end].toLowerCase())) {
            isWordSymmetric(words, start +1, end -1);
            return true;

        } else { return false; }

    }
    public static double computePyramidWeights(double[][] weights, int row, int column) {
        if(row < 0 || column < 0 || row > weights.length - 1 || column > weights[row].length - 1) {
            return 0;
        }
        else if (row == 0 && column == 0) {
            return weights[0][0];
        }
        else if (column == 0) {
           return  weights[row][column] + (computePyramidWeights(weights, row - 1, column))/2;
        }
        return weights[row][column] + (computePyramidWeights(weights,row - 1, column - 1))/2;
    }
    public static int howManyOrganisms(char[][] image) {
        int organismCount = 0;
        char organismLetter = 'a';

        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length; j++){
                if (image[i][j] == '*'){
                    organismCount += howManyOrganisms(image, i, j, organismLetter);
                    ++organismLetter;
                }
            }
        }
        return organismCount;
    }
    public static int howManyOrganisms(char[][] image, int i, int j, char organismLetter) {

        image[i][j] = organismLetter;
        if (j - 1 >= 0 && image[i][j - 1] == '*') {
            howManyOrganisms(image, i, j - 1, organismLetter);
        }
        if (j + 1 < image[i].length && image[i][j + 1] == '*') {
            howManyOrganisms(image, i, j + 1, organismLetter);
        }
        if (i - 1 >= 0 && j <= image[i-1].length-1 && image[i - 1][j] == '*') {
            howManyOrganisms(image, i - 1, j, organismLetter);
        }
        if (i + 1 < image.length && j <= image[i+1].length-1 && image[i + 1][j] == '*') {
            howManyOrganisms(image, i + 1, j, organismLetter);
        }
        return 1;
    }
}
