/*
 * Represents a Asian snack that is sold at the Asian Grocery Store
 * Asian Snack is a type of Asian Product
 */

public class AsianSnack extends AsianProducts {
  
 private boolean isSweet;  // Shows if the snack is sweet

   /*
   * Sets isSweet to true
   */
 public AsianSnack() {
   super();
    isSweet = true;
  }

   /*
   * Sets the name to the specified name, the price to the
   * specified price, and isSweet to the specified status
   */
 public AsianSnack(String name, double price, boolean isSweet) {
   super(name, price);
   this.isSweet = isSweet;
 }

  /*
   * Returns the value assigned to isSweet
   */
  public boolean isSweet() {
    return isSweet;
  }

  public void setIsSweet(boolean newIsSweet) {
    isSweet = newIsSweet;
  }

  /*
  * Overides the code
  */
  public String toString() {
    String snak = "Food: Snack\n";
    snak += super.toString();
    snak += ", isSweet?: " + isSweet;
    return snak;
  }
}