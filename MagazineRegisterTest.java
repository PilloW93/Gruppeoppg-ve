import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MagazineRegisterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MagazineRegisterTest
{
    /**
     * Default constructor for test class MagazineRegisterTest
     */
    public MagazineRegisterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testFindMagazineByName()
    {
        MagazineRegister magazine1 = new MagazineRegister();
        magazine1.fillRegisterWithMagazines();
        assertNotNull(magazine1.findMagazinesByTitle("le"));
    }

    @Test
    public void testAddMagazine()
    {
        MagazineRegister magazine1 = new MagazineRegister();
        Magazine magazine2 = new Magazine("coffee", "Sit");
        magazine1.addMagazine(magazine2);
        magazine1.listAllMagazines();
    }
}


