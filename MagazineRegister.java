import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a register that holdes magazines in a newsstand.
 * Keeps track of the number of magazines in the register.
 * can: 
 * - add a magazine
 * - remove magazine
 * - list the magazines
 * - get number of magazines in the stand
 *
 * @author (Group 8 - Sondre Grebstad, Emilie Skarbø, Vilde-Sofie Didriksen)
 * @version (v0.1)
 */
public class MagazineRegister
{
    private ArrayList<Magazine> magazineList;

    /**
     * Creates a list of magazines
     */
    public MagazineRegister()
    {
        magazineList = new ArrayList<Magazine>();

    }

    /**
     * Add a magazine to the register
     * @param magazine The magazine to be added to the register.
     */
    public void addMagazine(Magazine magazine)
    {
        magazineList.add(magazine);
    }

    /**
     * Remove a file from the register.
     * @param index in array
     */
    public void removeMagazine (int index)
    {
        if (index >= 0 && index < magazineList.size())
        {
            magazineList.remove(index);
        }
    }

    /**
     * Get number of magazines in the register
     * @return number of magazines in the register
     */ 
    public int getNumberOfMagazines()
    {
        return magazineList.size();
    }

    /** 
     * Makes a list of all the magazines from the register
     */
    public void listAllMagazines()
    {
        Iterator<Magazine>it = magazineList.iterator();
        while (it.hasNext())
        {
            Magazine magazine = it.next();
            System.out.println(magazine.getTitle());
        }
    }

    public Iterator <Magazine> getIterator()
    {
        return this.magazineList.iterator();
    }

    /**
     * Fills the register with magazines
     * FOR TESTING!
     */
    public void fillRegisterWithMagazines()
    {
        this.addMagazine(new Magazine("Learn java", "NTNU"));
        this.addMagazine(new Magazine("Tea Time", "The Time"));
    }

    // /**
    // * Search for a magazine by title and returns it if found
    // * @return the found magazine
    // * @param title of magazine, type String
    // */
    // public Magazine findMagazineByName(String title)
    // {
    // Magazine foundmagazine = null;

    // boolean found = false;
    // Iterator<Magazine> it = this.magazineList.iterator();
    // while (it.hasNext() && !found)
    // {
    // Magazine magazine = it.next();
    // if (magazine.getTitle().toLowerCase().contains(title.toLowerCase()))
    // {
    // foundmagazine = magazine;
    // found = true;
    // }

    // }
    // return foundmagazine;
    // }

    public ArrayList<Magazine> findMagazinesByTitle(String title)
    {
       

    ArrayList<Magazine> foundmagazines = new ArrayList<Magazine>();

    boolean found = false;
    for (Magazine mag: this.magazineList)

    {
        if (mag.getTitle().toLowerCase().contains(title.toLowerCase()))
        {
            foundmagazines.add(mag);
        }

    }
    return foundmagazines;
}
}
