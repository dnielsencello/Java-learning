public class Casting {
    public static void main(String[] args) {
        int letterA = 65;
        char ch = (char)letterA;
        System.out.println("The character is : " + ch);

        int fromChar = (int)'A';
        System.out.println("The number is: " + fromChar);
    }
}