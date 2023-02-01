import java.util.Scanner;

public class SlopeOfLineCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void calculate() {
        System.out.print("Enter a slope: ");
        float slope = scanner.nextFloat();

        System.out.print("Enter a y-intercept: ");
        float yIntercept = scanner.nextFloat();

        System.out.println("Your equation is: y = " + slope + "x + " + yIntercept);
    }

    public static void main(String[] args) {
        System.out.println("Line equation calculator");
        System.out.println("==================");

        calculate();
    }
}
