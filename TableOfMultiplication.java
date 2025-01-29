
 import java.util.Scanner;
public class TableOfMultiplication{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" number : ");
        int number = scanner.nextInt();
        System.out.print(" range : ");
        int range = scanner.nextInt();
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
}

    

