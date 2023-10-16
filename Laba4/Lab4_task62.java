package Laba4;
import java.util.Scanner;
import java.util.Arrays;
public class Lab4_task62 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть кiлькiсть елементiв у масивi: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введiть елементи масиву:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] result = transformArray(array);
        System.out.println("Результат: " + Arrays.toString(result));
    }

    public static int[] transformArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнiм.");
        }

        int min = Arrays.stream(array).min().getAsInt();
        if (min == 0) {
            return Arrays.stream(array).map(x -> -10).toArray();
        }

        return Arrays.stream(array).map(x -> x / min).toArray();
    }
}