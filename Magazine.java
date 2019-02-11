
/**
 * Store details of the magazine,
 * such as title, publisher(, number releases per year), genre and price.
 * 
 *
 * @author (Vilde-Sofie Didriksen)
 * @version (v0.1)
 */
public class Magazine
{
    // the title og the magazine
    private String title;
    
    //magazine's publisher
    private String publisher;
    
    // Number of releases per year
    //private int releases;
    
    // Tells the magazine's genre
    private String genre;
    
    // Price for the magazine
    private int price;
    

    /**
     * Constructor for objects of class Magazine.
     * sets the title, publisher and genre.
     */
    public Magazine(String title, String publisher, String genre)
    {
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
    }

    /**
     * Returns the title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * returns the publisher
     */
    private String getPublisher()
    {
        return publisher;
    }
    
    /**
     * returns the genre
     */
    private String getGenre()
    {
        return genre;
    }
    
    /**
     * Retuns the details of tehe magazine.
     */
    public void printDetails()
    {
     System.out.println(title);
     System.out.println("Publisher: " + publisher);
     System.out.println("Genre: "+ genre);
    }
    
    /**
     * Set the price of the magazine
     */
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    /**
     * returns the price of the magazine
     */
    public int getPrice()
    {
        return price;
    }
}
