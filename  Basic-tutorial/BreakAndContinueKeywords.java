public class BreakAndContinueKeywords {
  public static void main(String[] args) {
    int count = 0;

    while(count < 10){
      if(count == 5){
        System.out.println("breaking out of loop");
        break;
      }
      System.out.println(count);
      count++;
    } 
    System.out.println("loop ended");
  }
}

class AnotherExample {
  public static void main(String[] args) {
    for (int i = 0; i <= 100; i ++){
      if (i % 2 == 1){
        //it is not an odd so continue
        continue;
      }
      System.out.println(i);
    }
  }
}
