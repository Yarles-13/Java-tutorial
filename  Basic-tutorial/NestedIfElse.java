import java.util.Scanner;

public class NestedIfElse {
  public static void main(String[] args) {
    int answer = 3;
    Scanner in = new Scanner(System.in);
    System.out.print("Guess a number between 1-10?");
    String input = in.nextLine();
    int userGuess = Integer.parseInt(input);
    System.out.print(userGuess);

    if (userGuess == answer) {
      System.out.println("Correct!");
    } else {
      System.out.print("Sorry your guess was ");
      if (userGuess > answer) {
        System.out.print("too High");
      } else {
        System.out.print("too Low");
      }
    }
    in.close();
  }
}

class IfElseLadder {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("How old are you?");
    String input = in.nextLine();
    int age = Integer.parseInt(input);

    if (age >= 35) {
      System.out.print("You can run fir orez");
    } else if (age >= 21) {
      System.out.print("contrats! you can buy a drink");
    } else if (age >= 18) {
      System.out.print("you can vote");
    } else {
      System.out.print("Sorry, buddy.. too young for anything");
    }

    in.close();
  }
}
