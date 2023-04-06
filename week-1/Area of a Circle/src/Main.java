

//The formula to calculate the area of a circumference is defined as A = π . R2.
// Considering to this problem that π = 3.14159:
// Calculate the area using the formula given in the problem description.
// Input
//      The input contains a value of floating point (double precision), that is the variable R.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Enter the Radius of the Circle");
        double radius = scanner.nextDouble();
        double area = Math.pow(radius ,2) * pi ;
        System.out.println("A ="+area);

    }
}