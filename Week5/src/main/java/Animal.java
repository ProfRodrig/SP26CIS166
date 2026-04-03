/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shpctac100b5
 */
public class Animal 
{
    private static int  numAnimals = 0;
    private String name;
    private String type;

    /**
     * The constructor for this class, sets up the fields
     * @param name - the name of the animal
     * @param type  - the type of animal (ex: cat, dog)
     */
    public Animal(String name, String type) 
    {
        this.name = name;
        this.type = type;
        numAnimals++;
    }

    /**
     * The default constructor sets up a animal called cat, with type dog
     */
    public Animal() 
    {
        this.name = "cat";
        this.type = "dog";
        numAnimals++;
    }
    
    public Animal(Animal a)
    {
        this.name = a.name;
        this.type = a.type;
        numAnimals++;
    }

    /**
     * 
     * @return the name of the Animal
     */
    public String getName() 
    {
        return name;
    }

    /**
     * 
     * @param name the name of the animal
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * 
     * @return the type of the Animal
     */
    public String getType() 
    {
        return type;
    }

    /**
     * 
     * @param type sets the type of the animal
     */
    public void setType(String type) 
    {
        this.type = type;
    }

    public static int getNumAnimals() 
    {
        return numAnimals;
    }

    public static void setNumAnimals(int n) 
    {
        numAnimals = n;
    }
    
    public void copy(Animal a)
    {
        this.name = a.name;
        this.type = a.type;
    }
    
    public Animal makeCopy()
    {
        return new Animal(name, type);
    }
    
    public boolean equals(Animal a)
    {
        return this.name.equalsIgnoreCase(a.name) &&
                this.type.equalsIgnoreCase(a.type);
    }
    
    
    
    
    
}
