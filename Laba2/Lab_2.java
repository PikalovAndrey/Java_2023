public class Lab_2 {

    public static void main(String[] args) {

        double a1 = -1.23;
        double b1 = -0.34;
        double c1 = 0.707;
        double d1 = 2.312;

        double squareRoot = Math.sqrt(Math.sin(c1) + Math.exp(d1));
        double log1 = Math.log10(Math.abs(b1/a1));
        double res1 = 3*(log1 + squareRoot);
        System.out.println("1st exercise: " + res1);
        System.out.println( );

        double a2 = 0.58;
        double b2 = 0.34;
        double c2 = 1.25;
        double d2 = -1.89;

        double fraction = 2*Math.sin(a2)/Math.acos(-2*b2);
        double log2 = Math.log(c2*Math.abs(2*d2));
        double square = Math.sqrt(log2);
        double res2 = fraction - square;
        System.out.println("2nd exercise: " + res2);
        System.out.println( );

        double a3 = 1.27;
        double b3 = 10.99;
        double c3 = 4.0;
        double d3 = -25.32;

        double numerator = Math.pow(Math.tan(a3), 1.0 / c3);
        double denomerator = 2 - Math.sinh(b3)/Math.log(Math.abs(d3+c3));
        double res3 = numerator/denomerator;
        System.out.println("3rd exercise: " + res3);
    }

}
