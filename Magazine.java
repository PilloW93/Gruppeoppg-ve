
/**
 * Store details of the magazine,
 * such as title, publisher, genre and price.
 * 
 *
 * @author (Group 8 - Sondre Grebstad, Emilie Skarbø, Vilde-Sofie Didriksen)
 * @version (v0.1)
 */
public class Magazine
{
    // the title og the magazine
    private String title;

    //magazine's publisher
    private String publisher;

    // Tells the magazine's genre
    private String genre;

    // Price for the magazine
    private int price;

    /**
     * Creates an instance of the class Magazine.
     * sets the title, publisher and genre.
     * 
     * @param title The title of the magazine
     * @param publisher The publisher of the magazine
     */
    public Magazine(String title, String publisher)
    {
        this.title = title;
        this.publisher = publisher;
        
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
    public String getPublisher()
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
     * sets the genere of the Magazine.
     */
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    
     /**
     * Set the price of the magazine.
     */
    public void setPrice(int price)
    {
        this.price = price;
    }

    /**
     * Print the details of the magazine.
     * Prints title, publisher and genre.
     */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
    }


    /**
     * returns the price of the magazine
     * @return price, the price of the magazine.
     */
    public int getPrice()
    {
        return price;
    }
}
