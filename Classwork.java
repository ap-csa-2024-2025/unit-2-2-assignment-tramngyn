import java.util.Scanner;

public class Classwork
{

  public static void main(String[] args)
  {
    // Shopping
    Scanner scanner = new Scanner(System.in); // create scanner object to take input

    System.out.println("What type of item are you buying?"); 
    String itemType = scanner.nextLine(); // type of item

    System.out.println("How many are you buying?");
    int numberOfItems = scanner.nextInt(); // how much of item

    System.out.println("How much does each one weigh?");
    double weightPerItem = scanner.nextDouble(); // weight of item

    double totalWeight = numberOfItems * weightPerItem; // calculation of total weight
    System.out.println(numberOfItems + " " + itemType + " at " + weightPerItem + " pounds each will weigh " + totalWeight + " pounds total.");

    System.out.println();
    System.out.println();
    
    // Quote
    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\n Ada Lovelace\n The first computer programmer");

    System.out.println();
    System.out.println();
   
    // Rabit
    System.out.println("(\\(\\\n( - -)\n((') (')");
  }
}
