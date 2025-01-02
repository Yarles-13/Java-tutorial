public class LifeTimeandScope {
  public static void main(String[] args) {
    int x = 10;
    int y = 11;
    // this scope cannot access z
  // lifecycle for x and y ends 
    if (x == y) {
      // int z;
      // z is going out of scope.. its lifetime has ended
      // this scope has access to x and y
    }

  }
}

class Example2 {
  public static void main(String[] args) {

    for (int count = 0; count <= 10; count++){
      int x = 1;
    
      System.out.println(x);
      x = 100;
      System.out.println(x);
    }
  }
}