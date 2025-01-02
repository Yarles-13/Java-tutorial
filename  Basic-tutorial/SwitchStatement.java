public class SwitchStatement {
  public static void main(String[] args) {
    int points = 0;
    char grade = 'B';

    switch (grade){
      case 'A':
        points += 100;
        break;
      case 'B':
        points += 90;
        break;
      case 'C':
        points += 80;
        break;
      default: 
        points += 70;
    }

    System.out.print("You have " + points + " points");
  }
}
