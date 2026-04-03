/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jprodrigues
 */
public class Movie extends Media 
{
    private int duration;
    
    public Movie()
    {
        duration = 5400;
    }
    
    public Movie(String title, String genre, String producer, int duration)
    {
       
        super(title, genre, producer);
        this.duration = duration;
    }
    
    public int getDuration()
    {
        return duration;
    }
    
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    
    @Override
    public String toString()
    {
        int hours = duration / 3600;
        int remainingSeconds = duration % 3600;
        int minutes = remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;
        
        return super.toString() +
                "\nDuration: " + hours + "hours, "
                + minutes + " minutes and " +
                remainingSeconds + " seconds";
    }
}
