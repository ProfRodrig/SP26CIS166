/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author jprodrigues
 */
public class Chapter7 
{

    public static void main(String[] args) 
    {
        Movie home = new Movie("Hello", "test", "oops", 5402);
        TVShow flash = new TVShow("Flash", 
                "Superhero", "Some Person", 
                188, 9, 2583);
        System.out.println(home);
        System.out.println(flash);
        
        Media uncertain;
        
        uncertain = new Movie();
        System.out.println(uncertain.getDuration());
        uncertain = new TVShow();
        System.out.println(uncertain);
        
    }
}
