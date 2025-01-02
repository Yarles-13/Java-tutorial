import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the temperature in C");

    float tempC = scan.nextFloat();

    float tempF = (tempC * 9/5) + 32;

    System.out.println(tempF);

    scan.close();
  }
}
