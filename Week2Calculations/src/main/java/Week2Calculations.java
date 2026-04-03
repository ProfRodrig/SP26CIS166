
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/** 
 *
 * @author John Rodrigues
 * Date: 1/30/26
 * Purpose: To calculate different measurements and practice using
 * input and output.
 */
public class Week2Calculations 
{

    public static void main(String[] args) 
    {
           
        // variable declarations
        double area;
        double radius;
        String color;
        Scanner keyboard = new Scanner(System.in);
        
        // input radius
        System.out.print("Enter circle's radius: ");
        radius = keyboard.nextDouble();
        
        // input color
        System.out.print("What color would you like to use? ");
       
        keyboard.nextLine(); // clear the buffer by removing the ENTER key
        color = keyboard.nextLine(); 
        
        // calculate area
        area = Math.PI * Math.pow(radius, 2);
        
        // Display area
        System.out.println("A(n) " + color + " circle with radius " + radius 
                            + " meters, has an area of " + area 
                            + " sq. meters"  );
      
    }
}
