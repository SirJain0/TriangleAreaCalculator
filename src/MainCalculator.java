import java.util.Scanner;

public class MainCalculator {
    static Scanner consoleReader = new Scanner(System.in);

    public static void calculate() {
        System.out.print("Enter a base: ");
        float base = consoleReader.nextFloat();

        System.out.print("Enter a height: ");
        float height = consoleReader.nextFloat();

        System.out.println("Your area is: " + 0.5 * base * height);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Triangle Area Calculator!");
        System.out.println("=================");

        calculate();
    }
}