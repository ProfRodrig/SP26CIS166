/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jprodrigues
 */
public class Media 
{
    private String title;
    private String genre;
    private String producer;

    /** 
     * @param title ...
     * @param genre ...
     * @param producer ...
    */
    public Media(String title, String genre, String producer) 
    {
        this.title = title;
        this.genre = genre;
        this.producer = producer;
    }
    
    public Media()
    {
        
        this.title = "N/A";
        this.genre = "N/A";
        this.producer = "N/A";
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getGenre() 
    {
        return genre;
    }

    public void setGenre(String genre) 
    {
        this.genre = genre;
    }

    public String getProducer() 
    {
        return producer;
    }

    public void setProducer(String producer) 
    {
        this.producer = producer;
    }
    
    @Override
    public String toString()
    {
        return "Title: " + this.title +
               "\nGenre: " + genre +
                "\nProducer: " + getProducer();
    }
    
    public int getDuration()
    {
        return 0;
    }
}
