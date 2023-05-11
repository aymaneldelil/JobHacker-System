
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter : 1'st Student Grade !");
        double studen1 = scanner.nextDouble();
        System.out.println("Please Enter : 2'nd Student Grade !");
        double studen2 = scanner.nextDouble();
        System.out.println("Please Enter : 1'rd Student Grade !");
        double studen3 = scanner.nextDouble();
        double gradeAverage = (studen1 + studen2 + studen3) /3;
                System.out.println("MEDIA = "+gradeAverage);
    }
}