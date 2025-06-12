import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
            a + " and " + b + " is " + (a + b) + ", " + (a - b) + ", " + (a * b) + ", and " + (a / b));

    }
}
