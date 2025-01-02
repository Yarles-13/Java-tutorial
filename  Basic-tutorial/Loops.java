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

class Example {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for (int number = 0; number <= n; number++) {
      System.out.println(number + " ");
      System.out.println("Hello");
    }

    in.close();
  }
}


// use for loop when u know how many times it is going to run

// use while loop when you dont know how many times the loop will run (depends on another factor)

// do while loop is gauranteed to  to execute at least once 

class doWhileTricky {
  public static void main(String[] args) {
    int num = 1;
    do {
      System.out.println("Hey there");
    } while (num != 1);
  }
 // this print statement will still run even though the conditon doesnt allow.. 
}