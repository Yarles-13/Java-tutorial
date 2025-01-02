import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
      int i;
    for(i = 0; i < args.length; i++){
      System.out.println(i);
    }
  }
}

class WhileLoop {
  public static void main(String[] args) {
    int count = 0;
    while(count < 10 ){
      System.out.print(count + " ");
      count++;
    }
  }
}

class DoWhile {
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    int userValue;

    do{
      System.out.println("Main Menu");
      System.out.println("1. Reset Game");
      System.out.println("2. Show high scores");
      System.out.println("3. Quit");
      System.out.println("Enter a value");

      userValue = Integer.parseInt(scanner.nextLine());
      System.out.println("You entered: " + userValue);
    } while (userValue != 3);

    System.out.println("Goodbye");
    scanner.close();
  }
}