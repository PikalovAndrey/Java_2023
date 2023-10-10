import java.util.Scanner;

public class Lab3_task12 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введiть точнiсть (є): ");
            double epsilon = scanner.nextDouble();

            double result = calculateInfiniteSum(epsilon);
            System.out.println("Результат обчислення нескiнченної суми: " + result);

            scanner.close(); // Закрити Scanner
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }

    public static double calculateInfiniteSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("Точнiсть (є) має бути більше 0.");
        }

        double sum = 0.0;
        double term = 1.0;
        int i = 1;

        while (Math.abs(term) >= epsilon) {
            sum += term;
            i++;
            term = 1.0 / (i * (i + 1));
        }

        return sum;
    }
}
