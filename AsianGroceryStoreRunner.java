import java.util.Scanner;

/*
 * Represents a Store that sells food
 */
public class AsianGroceryStoreRunner {
  public static void main(String[] args) {

    /*
  * Instantiates and prints the Asian Products
  * Prints a new line as well as the name and price
      */
  System.out.println("Welcome to the Asian Grocery Store!");
  System.out.println("\n");
  AsianProducts pro1 = new AsianProducts("Sushi", 9.99);
  System.out.println(pro1.toString());
  System.out.println("\n");
  System.out.println("---------------------------------------------");
  System.out.println("\n");

    /*
  * Instantiates and prints the Asian Snack
  * Prints a new line as well as the name of the snack, price, and whether it is sweet or not
      */
    AsianSnack snack1 = new AsianSnack("Mochi Donut", 2.99, true);
    System.out.println(snack1.toString());
    System.out.println("\n");
    System.out.println("---------------------------------------------");
    System.out.println("\n");
    snack1.setName("Boba");
    snack1.setPrice(3.99);
    snack1.setIsSweet(true);
    System.out.println("New\n" + snack1.toString());
    System.out.println("\n");
    System.out.println("---------------------------------------------");
    System.out.println("\n");

    /*
  * Instantiates and prints the Asian Dish
  * Prints a new line as well as the name of the dish, the price, and whether or not it is cold
      */
   AsianDish dish3 = new AsianDish("Kimchi", 2.99, true);
   System.out.println(dish3.toString());
   System.out.println("\n");
   System.out.println("---------------------------------------------");
   System.out.println("\n");

  /*
  * Sets the name and price of the dish and whether or not the dish is cold
  * Prints a new line and a thank you message
    */
   dish3.setName("Sashimi Platter");
   dish3.setPrice(99.99);
   dish3.setIsCold(true);
   System.out.println("New\n" + dish3.toString());
   System.out.println("\n");
   System.out.println("Thank you for visitng!");
 
    
  }
}
