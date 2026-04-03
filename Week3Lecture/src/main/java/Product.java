/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jprodrigues
 */

/*
    UML DIAGRAM:
            Product
---------------------------------
- price : double
- name : String
- description : String
-----------------------------------------
+ Product( ) 
+ Product(p : double, n : String, d : String)
+ getPrice( ) : double
+ getName( ) : String
+ getDescription( ) : String
+ setPrice(p : double ) : void
+ setName(n : String ): void
+ setDescription(d : String) : void

*/
public class Product 
{
    // Fields:
    private double price;
    private String name;
    private String description;
    
    // Methods:
    public Product()
    {
        setPrice(9.87);
        setName("N/A");
        setDescription("");
    }
    /**
     * 
     * @param p the price
     * @param n the product name
     * @param d the product description
     */
    public Product(double p, String n, String d)
    {
        setPrice(p);
        setName(n);
        setDescription(d);
    }
    
    
    /**
     * Function: getPrice()
     * @return the price of the product (double)
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * Function: getName()
     * @return the name of the product (String)
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Function: getDescription()
     * @return the description of the product (String)
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Function: setPrice()
     * @param p The price provided to the object. (double)
     * 
     */
    public void setPrice(double p)
    {
        price = p;
    }
     
    /**
     * Function: setName()
     * @param n The name of the product provided to the object. (String)
     * 
     */
    public void setName(String n)
    {
        name = n;
    }
    
    /**
     * Function: setDescription()
     * @param d The description of the product provided to the object. (String)
     * 
     */
    public void setDescription(String d)
    {
        description = d;
    }
    
    @Override
    public String toString()
    {
        return "Product: " + name + "\nPrice: $" + price 
                + "\nDescription: " + description + "\n";
    }
}
