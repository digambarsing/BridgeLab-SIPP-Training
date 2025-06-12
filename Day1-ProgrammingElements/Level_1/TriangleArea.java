import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double height = input.nextDouble();

        double areaInches = 0.5 * base * height;

        double areaCm = areaInches * 6.4516;

        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");

        input.close();
    }
}
