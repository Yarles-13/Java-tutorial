// Q1. find the largest of the 3 numbers

import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();
    
    int max = number1;
    if (number2 > max){
      max = number2;
    } 
    if (number3 > max){
      max = number3;
    }

    System.out.println(max);

    input.close();
    
  }
}


// save a maximum variable to hold the current highest num 
// perform checks on the current maxium if the element > maxium 
// push number to maxium variable else 
// go to next number and repeat 

