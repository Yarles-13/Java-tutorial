import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first value: ");
        double firstValue = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Enter the second value: ");
        double secondValue = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Enter operation (+, -, /, *): ");
        String operation = scanner.nextLine();

        System.out.print("The Answer: ");
        
        if (operation.equals("+")) {
            System.out.println(firstValue + secondValue);
        } else if (operation.equals("-")) {
            System.out.println(firstValue - secondValue);
        } else if (operation.equals("*")) {
            System.out.println(firstValue * secondValue);
        } else if (operation.equals("/")) {
            if (secondValue != 0) {
                System.out.println(firstValue / secondValue);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation. Please enter one of +, -, /, *.");
        }
        
        scanner.close();
    }
}
