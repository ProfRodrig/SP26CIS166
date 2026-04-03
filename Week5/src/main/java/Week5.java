/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author jrodrigues
 */
public class Week5 
{

    public static void main(String[] args) 
    {
        System.out.println("Current Number of Animals: " + Animal.getNumAnimals());
        Animal pet = new Animal("Blue", "Parrot");
        Animal cPet = new Animal(pet);
        Animal aCopy = pet.makeCopy();
        cPet.setName("Rex");
        cPet.setType("Dog");
        System.out.println("Copies's name is: " + cPet.getName());
        System.out.println("Pet's name is: " + pet.getName());
        System.out.println("aCopy's name is: " + aCopy.getName());
        System.out.println("Current Number of Animals: " + Animal.getNumAnimals());
        
        if (pet == aCopy)
        {
            System.out.println("Variables pet and aCopy are the same address.");
        }
        else
        {
            System.out.println("Variables pet and aCopy are NOT the same address.");
        }
        
         if (pet.equals(aCopy))
        {
            System.out.println("Variables pet and aCopy are the same content.");
        }
        else
        {
            System.out.println("Variables pet and aCopy are NOT the same content.");
        }
    }
}
