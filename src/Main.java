public class Main
{   public static void main(String[] args)
    { double purchasePrice = 20;
      double salesTax = 0.05;
      double totalPrice = 0;

      totalPrice = salesTax * purchasePrice + purchasePrice;


      System.out.println("The purchase price is " + purchasePrice);
      System.out.println("You will have a 5% sales tax");

      System.out.println("Your total price is " + totalPrice );


    }
}