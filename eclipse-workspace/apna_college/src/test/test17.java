package test;

public class test17 {

   public static void main(String[] args) {
      int number = 1;
      System.out.println("The value of the number in the main program: " + number);
      number=incrementByThree(number);
      System.out.println("The value of the number in the main program: " + number);
   }

   public static int incrementByThree(int number) {
      System.out.println("The value of the number in the  method: " + number);
      number = number + 3;
      System.out.println("The value of the number in the  method: " + number);
      return number;
   }
}
