public class IfElse {
  public static void main(String[] args) {
    boolean goToElseStatement = false;

    if (goToElseStatement) {
      System.out.println("In if Statement block");
    } else {
      System.out.println("In else statement");
    }
    System.out.print("after if statement");
  }
}

class LogicalAndRelationalOperators {
  public static void main(String[] args) {
    int x = 5;
    int y = 8;
    int z = 5;
    if (x <= y && x <= z) {
      System.out.println("In if statement");
    } else {
      System.out.println("In else block");
    }
    System.out.println("Outside the if/else block");
  }
}

class OperatorPrecedence {
  public static void main (String[] args){
    int firstValue = 13;
    int secondValue= 24;
    int thirdValue = 13;

    //program will evaluate the right side FIRST (operator precendence) before the left side .. 
    if( firstValue == secondValue || (firstValue <= secondValue && firstValue != thirdValue)){
      System.out.println("In if block");
    } else {
      System.out.println("In else block");
    }
    System.out.println("Outside");
  }
}
