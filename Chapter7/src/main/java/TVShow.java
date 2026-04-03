/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jprodrigues
 */
public class TVShow extends Media 
{
    private int numEpisodes;
    private int numSeasons;
    private int avgDuration;
    
    public TVShow()
    {
        numEpisodes = 8;
        numSeasons = 1;
        avgDuration = 3000;
    }

    public TVShow(String title, String genre, String producer, 
            int numEpisodes, int numSeasons, int avgDuration) 
    {
        super(title, genre, producer);
        this.numEpisodes = numEpisodes;
        this.numSeasons = numSeasons;
        this.avgDuration = avgDuration;
    }
    
    public String toString()
    {
        int total = avgDuration * numEpisodes;
        int hours = total / 3600;
        total = total % 3600;
        int minutes = total / 60;
        total = total % 60;
        
        return "TV SHOW " + super.toString() +
                "\nTotal  Duration: " + hours + " hours, " +
                minutes + " minutes and " +
                total + " seconds";
                
    }
    
    
}
