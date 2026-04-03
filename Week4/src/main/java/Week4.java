
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author jprodrigues
 */
public class Week4 
{

    public static void main(String[] args) throws IOException 
    {
        File myFile = new File("myData.txt");
        Scanner inputFile = new Scanner(myFile);
        int radius;
        String color;
        
        radius = inputFile.nextInt();
        inputFile.nextLine();
        color = inputFile.nextLine();
        
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        
        inputFile.close();
        
    }
}
