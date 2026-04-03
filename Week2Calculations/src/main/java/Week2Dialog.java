
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jprodrigues
 */
public class Week2Dialog 
{
    public static void main(String[] args) 
    {
        // variable declaration
        double area;
        double radius;
        String userInput;
        String color;
        
        // input the radius
        userInput = JOptionPane.showInputDialog("Enter circle radius: ");
        radius = Double.parseDouble(userInput);
        
        // input color
        color = JOptionPane.showInputDialog("Enter circle color: ");
        
        // Calculare area
        area = Math.PI * Math.pow(radius, 2);
        
        // Display area:
        JOptionPane.showMessageDialog(null, String.format("%-50s", "A(n) " + color 
                                        + " circle with radius ")  
                                        + String.format("%10.3f", radius) 
                                        + " meters,\n" 
                                        + String.format("%-50s", "has an area of " )
                                        + String.format("%10.3f",area) 
                                        + " sq. meters"  );

    }
    
}
