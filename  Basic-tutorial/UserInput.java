import java.util.Scanner;

public class UserInput {
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("What is your name?");
    String input = in.nextLine();
    System.out.print("Hello " + input);
    in.close();
  }
}