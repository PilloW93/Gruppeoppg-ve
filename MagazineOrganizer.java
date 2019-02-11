import java.util.ArrayList;
import java.util.Iterator;

/**
 * represents a register that holdes reading material in the newsstand.
 * Keeps track of the number of magazines in the stand.
 * can: 
 * - add a magazine
 * - remove magazine
 * - list the magaznes
 * - get number of filez in the stand
 *
 * @author (Vilde-Sofie Didriksen)
 * @version (v0.1)
 */
public class MagazineOrganizer
{
   
    private ArrayList<Magazine> magazines;

    /**
     * Constructor for objects of class MagazineOrganizer
     */
    public MagazineOrganizer()
    {
        magazines = new ArrayList<>();
    }

    /**
     * Add a magazine to the stand 
     */
    public void addMagazine(Magazine magazine)
    {
        magazines.add(magazine);
    }
    
    /**
     * Remove a file from the stand.
     */
    public void removeMagazine (int index)
    {
        if(index >= 0 && index < magazines.size())
        {
            magazines.remove(index);
        }
    }
  
    /**
     * Get number of files in the stand
     */
    public int getNumberOfMagazines()
    {
        return magazines.size();
    }
    
    /** 
     * Prints a list of the magazines from the stand
     */
    public void printMagazines()
    {
        Iterator<Magazine>it = magazines.iterator();
        while(it.hasNext())
        {
            Magazine magazine = it.next();
            System.out.println(magazine.getTitle());
        }
    }
    
    /**
     * Fills the Magazineorganizer with magazines
     * for testing
     */
    public void fillOrganizorWithMagazines()
    {
        this.addMagazine(new Magazine("Learn java", "NTNU", "Studie"));
        this.addMagazine(new Magazine("Lær deg førstehjelp", "leger uten grenser", "Medisin"));
        this.addMagazine(new Magazine("Boken om te", "Te-tøsene", "Drikke"));
    }
    
    /**
     * Search for a magazine by title
     */
    public Magazine findMagazineByName(String title)
    {
        Magazine foundmagazine = null;
        
        boolean found = false;
        Iterator<Magazine> it = this.magazines.iterator();
        while(it.hasNext() && !found)
    {
        Magazine magazine = it.next();
        if(magazine.getTitle().contains(title))
        {
        foundmagazine = magazine;
        found = true;
        }
        
    }
    return foundmagazine;
    }
}
