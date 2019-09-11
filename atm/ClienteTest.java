

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClienteTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClienteTest
{
    /**
     * Default constructor for test class ClienteTest
     */
    public ClienteTest()
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
    public void testRetire()
    {
        Cliente cliente1 = new Cliente(1, "Marco Araya", 123, 100000);
        cliente1.retire(50000);
        assertEquals(50000.0, cliente1.deSaldo(), 0.1);
    }
}

