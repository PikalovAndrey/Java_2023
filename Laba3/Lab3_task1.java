import java.util.Scanner;

public class Lab3_task1 {
    public static double equationOfSum(int m, int k) {
        if (k > 30) {
            throw new IllegalArgumentException("k should be less than or equal to 30");
        }

        double sum = 0.0;
        for (int i = 1; i <= k; i++) {
            double term = Math.sqrt(m * (1.0 / i)) * Math.sin(m * i);
            sum += term;
        }
        return sum;
    }

    static void outputResults(int m, int k, double result) {
        System.out.println("m=" + m + ";\nk=" + k + ";\nvalue sum of series=" + result + ";");
    }

    public static void main(String[] args) {
        Lab3_task1 numeration = new Lab3_task1();
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Please specify a variable m: ");
            int m = in.nextInt();
            System.out.print("Please specify a value k (k should be less than or equal to 30): ");
            int k = in.nextInt();

            double result = numeration.equationOfSum(m, k);
            numeration.outputResults(m, k, result);
        } catch (Exception e) {
            System.out.println("Illegal Argument Exception");
        }
    }
}
