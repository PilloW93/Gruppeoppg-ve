

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MagazineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MagazineTest
{
    /**
     * Default constructor for test class MagazineTest
     */
    public MagazineTest()
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
    public void testGetDetails()
    {
        Magazine magazine1 = new Magazine("coffe", "Sit");
        magazine1.printDetails();
    }
}

