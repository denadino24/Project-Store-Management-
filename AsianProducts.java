/*
 * Represents Asian Products that can be sold
 * 
 */

public class AsianProducts {
  
  // Instance Variables
  
  private String name; // The name of the product sold
  private double price; // The price of the product sold
  
  // Constructor Methods
 // No-Argument
  /*
  * Sets the name and price of the product
  */
  
 public AsianProducts() {
    name = "sushi";
   price = 0.0;
  }
  
 /*
   * Sets the name to the specified name, and the price to the
   * specified price
   */
  // Parameterized
  
  public AsianProducts(String name, double price) {
    this.name = name;
    this.price = price;
  }
  
  /*
   * Returns the value assigned to name
   *  Accessor and Mutator Methods
  */
 
public String getName() {
  return name;
}

  /* 
  * Returns the value assigned to price
  */
  
public double getPrice() {
  return price;
}

  /* 
  * sets name to newName
  */
  
public void setName(String newName) {
  name = newName;
}

  /*
  * sets price to newPrice
  */
  
public void setPrice(double newPrice) {
  this.price = newPrice;
}

public String toString() {
  return "Name: " + name + ", Price: " + price;
}
} 
  
  
  
