import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();


        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();


        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        if ((num3 >= num1 && num1 >= num2) || (num2 >= num1 && num1 >= num3)) {
            System.out.println("The second largest number is: " + num1);
        } else if ((num3 >= num2 && num2 >= num1) || (num1 >= num2 && num2 >= num3)){
            System.out.println("The second largest number is: " + num2);
        } else {
            System.out.println("The second largest number is: " + num3);
        }

    }
}