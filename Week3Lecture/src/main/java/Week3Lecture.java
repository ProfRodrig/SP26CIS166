
import java.util.Scanner;

/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author jprodrigues
 */
public class Week3Lecture 
{

    public static void main(String[] args) 
    {
        // variable declaration
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product(55.99, "HyperX Headset", "Best sound quality!");
        Scanner keyboard = new Scanner(System.in);
        String inputName;
        String inputDescription;
        double inputPrice;
        
        // change price of the product to 99.99
        product1.setPrice(99.99);
        // change product's name
        product1.setName("Samsung TV 8k- 56\"");
        // change product's description
        product1.setDescription("best TV in the world!");
        
        // Set up product 2 based on user input
        // set product2 name
        System.out.print("What product would like to list? ");
        inputName = keyboard.nextLine();
        product2.setName(inputName);
        // set product2 price
        System.out.print("How much would you like to list " + inputName + " for? ");
        inputPrice = keyboard.nextDouble();
        product2.setPrice(inputPrice);
        // Set the description
        System.out.print("How would you describe " + inputName + "? ");
        keyboard.nextLine(); // removes the extra enter key from buffer
        inputDescription = keyboard.nextLine();
        product2.setDescription(inputDescription);
        
        
        
        
        // Display product 1 information
        System.out.println(product1);
        
        // Display product 2 information
        System.out.println(product2.toString());
        
        System.out.println(product3);
        System.out.println(product4);
    }
}
