import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Represents the user interface of the application.
 * Responseble for displaying the menu and receiving 
 * input from the user.
 *
 * @author (Vilde-Sofie Didriksen)
 * @version (v.01)
 */
public class ApplicationUI
{
    private String[] menuItems =
        {
            "1. List all products",
            "2. Add a new product",
            "3. Find a product by name",
        }; 
    private MagazineRegister magz;

    /**
     * Creates an applicationUI user interfadce.
     */
    public ApplicationUI()
    {
        magz = new MagazineRegister();
    }

    /**
     * Runs the application, show the menu and retrives information 
     * from the user.
     */
    public void run()
    {
        boolean quit = false;

        this.init();

        while(!quit)
        {
            try
            {
                int menuSelection = this.showMenu();
                switch(menuSelection)
                {
                    case 1:
                    this.listAllMagazines();
                    break;

                    case 2:
                    this.addMagazine();
                    break;

                    case 3:
                    this.findMagazinesByTitle();
                    break;

                    case 4:
                    System.out.println("\nThank you for using this application.");
                    System.out.println("Hope to see you soon!");
                    quit = true;
                    break;

                }
            }
            catch (InputMismatchException ime)
            {
                // System.out.println("\nERROR: Please provide a numberbetween 1 and" + this.menuItems.lenght + "..\n");
            }
        }

    }
    /**
    * 
    */
    private void init()
    {
        this.magz.fillRegisterWithMagazines();
    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items. 
     * If the user inputs anything else, an InputMismatchException is thrown. 
     * The method returns the valid input from the user.
     *
     * @return the menu number (between 1 and max menu item number) provided by the user.
     * @throws InputMismatchException if user enters an invalid number/menu choice
     */
    private int showMenu() throws InputMismatchException 
    {
        System.out.println("\n**** Newsstand application v0.1 ****\n");
        // Display the menu
        for ( String menuItem : menuItems )
        {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = menuItems.length + 1;
        // Add the "Exit"-choice to the menu
        System.out.println(maxMenuItemNumber + ". Exit\n");
        System.out.println("Please choose menu item (1-" + maxMenuItemNumber + "): ");
        // Read input from user
        Scanner reader = new Scanner(System.in);
        int menuSelection = reader.nextInt();
        if ((menuSelection < 1) || (menuSelection > maxMenuItemNumber)) 
        {
            throw new InputMismatchException();
        }
        return menuSelection;
    }

    private void listAllMagazines()
    {
        magz.getIterator();

        Iterator<Magazine> it = this.magz.getIterator();
        while (it.hasNext())
        {
            Magazine magazine = it.next();
            System.out.println("Title: " + magazine.getTitle()
                + "\nPublisher: " + magazine.getPublisher() + "\n");
        }

    }

    private void addMagazine()
    {
        // hente infor fra bruker,
        String title;
        String publisher;
        String genre;

        System.out.println("Please enter the title:");
        Scanner titleReader = new Scanner(System.in);
        title = titleReader.nextLine();
        System.out.println("title: " + title);

        System.out.println("Please enter the publisher:");
        Scanner publisherReader = new Scanner(System.in);
        publisher = publisherReader.nextLine();
        System.out.println("publisher: " + publisher);

        // System.out.println("Please enter the genre:");
        // Scanner genreReader = new Scanner(System.in);
        // genre = genreReader.nextLine();
        // System.out.println("genre: " + genre);

        // opprett et objekt av typen magazin
        Magazine mag = new Magazine(title, publisher);
        this.magz.addMagazine(mag);

    }

    private ArrayList<Magazine> findMagazinesByTitle()
    {
        String title;

        System.out.println("Please enter the title of the magazine you wish to find");
        Scanner reader = new Scanner(System.in);
        title = reader.nextLine();

        ArrayList<Magazine> foundMagazines = this.magz.findMagazinesByTitle(title);
        if (foundMagazines.isEmpty())
        {
            System.out.println("Could not find a magazine by this title");
        }

        else
        {
            for (Magazine magazine : foundMagazines)
            {
                System.out.println("Title: " + magazine.getTitle()
                    + "\nPublisher: " + magazine.getPublisher() + "\n");

            }
        }
        return foundMagazines;
    }
}
