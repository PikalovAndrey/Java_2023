package Laba4;
import java.util.Arrays;
import java.util.Scanner;
public class Lab4_task16 { 
     public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.print("Введiть кiлькiсть елементiв у масивi: ");
    //     int n = scanner.nextInt();
    //     int[] array = new int[n];

    //     System.out.println("Введiть елементи масиву:");
    //     for (int i = 0; i < n; i++) {
    //         array[i] = scanner.nextInt();
    //     }
    int[] array = new int[4];
Arrays.fill(array, 10);
System.out.println(Arrays.toString(array));
        double result = calculateGeometricMean(array);
        System.out.println("Середнє геометричне парних елементiв: " + result);
    }

    public static double calculateGeometricMean(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути поржнiм.");
        }

        double product = 1.0;
        int count = 0;

        for (int number : array) {
            if (number % 2 == 0) {
                product *= number;
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("В масиві немає парних чисел.");
        }

        return Math.pow(product, 1.0 / count);
    }
}