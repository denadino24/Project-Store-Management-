/*
 * Represents a Asian dish that is sold at the Asian Grocery Store
 * Asian Snack is a type of Asian Product
 */

public class AsianDish extends AsianProducts{

private boolean isCold; // SHows if the dish is cold

  /*
   * Sets isCold to true, super allows access to info/methods
   */
 public AsianDish() {
   super();
    isCold = true;
  }

  /*
   * Sets the name to the specified name, the price to the
   * specified price, and the isCold to the specified status
   */
 public AsianDish(String name, double price, boolean isCold) {
   super(name, price);
   this.isCold = isCold;
 }

   /*
   * Returns the value assigned to isCold
   */
  public boolean isCold() {
    return isCold;
  }

  public void setIsCold(boolean newIsCold) {
    this.isCold = newIsCold;
  }

  
  public String toString() {
    
    String snak = "Food: Dish\n";
    snak += "Name: " + super.getName() + " Price: " + this.getPrice();
    snak += ", isCold?: " + isCold;
    return snak;
  }
}



