import java.util.Scanner;
import java.lang.Math;
public class ISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN: ");
        String ISBN = input.next();
        double ISBN2 = Double.parseDouble(ISBN);
        double d1 = Math.floor(ISBN2/100000000);
        ISBN2 = ISBN2 - d1*100000000;
        double d2 = Math.floor(ISBN2/10000000);
        ISBN2 = ISBN2 - d2*10000000;
        double d3 = Math.floor(ISBN2/1000000);
        ISBN2 = ISBN2 - d3*1000000;
        double d4 = Math.floor(ISBN2/100000);
        ISBN2 = ISBN2 - d4*100000;
        double d5 = Math.floor(ISBN2/10000);
        ISBN2 = ISBN2 - d5*10000;
        double d6 = Math.floor(ISBN2/1000);
        ISBN2 = ISBN2 - d6*1000;
        double d7 = Math.floor(ISBN2/100);
        ISBN2 = ISBN2 - d7*100;
        double d8 = Math.floor(ISBN2/10);
        ISBN2 = ISBN2 - d8*10;
        double d9 = Math.floor(ISBN2);


        double checksum = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;
        if (checksum == 10) {
            String cs = "X";
            System.out.print("The ISBN-10 number is: " + ISBN + cs);
        }
        else {
            String cs = Double.toString(checksum);
            String c2 = ISBN + cs;
            double cad = Double.parseDouble(c2);
            System.out.printf("The ISBN-10 number is: %.0f", cad);
        }

    }
}