public class CompoundInterestCalculator {
  public static void main(String[] args) {
    double amount = 100;
    int year = 1;
    while(year <= 10){
      amount = amount * 1.1;
      System.out.print("$" + String.format("%.2f", amount) + " ");
      year++;
    }
  }
}
