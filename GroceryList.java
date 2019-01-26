import java.util.Scanner;

public class GroceryList {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter three items in grocery list");
    String item1, item2, item3;
    item1 = keyboard.nextLine();
    item2 = keyboard.nextLine();
    item3 = keyboard.nextLine();
    System.out.println("Please enter the quantity of each item");
    int quantity1, quantity2, quantity3;
    quantity1 = keyboard.nextInt();
    quantity2 = keyboard.nextInt();
    quantity3 = keyboard.nextInt();
    System.out.println("Please enter price of each item");
    float price1, price2, price3;
    price1 = keyboard.nextFloat();
    price2 = keyboard.nextFloat();
    price3 = keyboard.nextFloat();
    System.out.println("Calculating your grocery bill");
    float total;
    total = price1 * (float) quantity1 + price2 * (float) quantity2 + price3 * (float) quantity3;
    System.out.println("Your total cost is " + total);
  }
}
