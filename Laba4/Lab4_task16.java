package Laba4;

public class Lab4_task16 {
 public static void main(String[] args) {
        int[] array = {2, 4, 6, 8};
        double result = calculateGeometricMean(array);
        System.out.println("Середнє геометричне парних елементів: " + result);
    }

    public static double calculateGeometricMean(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім.");
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