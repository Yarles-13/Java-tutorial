//Method is like a function in javascript 
//reusable pieces of code 

public class Methods {
  public static void main(String[] args) {
    printMenu();
    printStuff();
    
  }

  public static void printStuff() {
    for (int i = 0; i < 10; i++){
      if(i == 5){
        return;
      }
      System.out.println(i);
    }
  }

  public static void printMenu (){
    System.out.println("Main Menu");
    System.out.println("1. Reset Game");
    System.out.println("2. New Game");
    System.out.println("3. Quit Game");
  }
}


class Arguments {
public static void main(String[] args) {
  printArea(3, 4);
}

  public static void printArea(int height, int width){
    int area = height * width;
    System.out.println("Area is "+ area);
  }
}
