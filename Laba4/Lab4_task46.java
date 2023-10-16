package Laba4;
import java.util.Scanner;
public class Lab4_task46 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть кiлькiсть елементiв у масивi: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введiть елементи масиву:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int result = calculateSum(array);
        System.out.println("Сума елементiв, що бiльшi за 3 i iндекс яких кратний 2: " + result);
    }

    public static int calculateSum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути прожнiм.");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > 3) {
                sum += array[i];
            }
        }

        return sum;
    }
}