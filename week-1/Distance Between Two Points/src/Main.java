import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1,x2,y1,y2 ,distance;
        //-----------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        //-----------------------------------------------------------
        System.out.println("The Point Of x1 : ");
        x1 = scanner.nextDouble();
        System.out.println("The Point Of y1 : ");
        y1 = scanner.nextDouble();
        //-----------------------------------------------------------
        System.out.println("The Point Of x2 : ");
        x2 = scanner.nextDouble();
        System.out.println("The Point Of y2 : ");
        y2 = scanner.nextDouble();
        //-----------------------------------------------------------
        distance = Math.sqrt( (Math.pow(x2-x1,2)+ Math.pow(y2-y1,2)));
        System.out.println(distance);

    }
}