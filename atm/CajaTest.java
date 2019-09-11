

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * The test class CajaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CajaTest
{
    /**
     * Default constructor for test class CajaTest
     */
    public CajaTest()
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
    
    @Test // Verificar minimo de billetes - 4
    public void testGetBills(){
        Moneda m1 = new Moneda(1, "Colon", 1.0, "24 de junio - 1998");
        Caja caja = new Caja(1,"6 set 19", new int[]{1000, 2000, 5000, 10000, 20000}, 
                new int[]{200, 200, 200, 200, 200}, m1 );
        int []prueba = new int[]{1,1,1,1,1};    
        Assert.assertArrayEquals(prueba,caja.getBills(38000));  
    }
    
    @Test // Desglose de billetes - 5
    public void testDesglose(){
        Moneda m1 = new Moneda(1, "Colon", 1.0, "24 de junio - 1998");
        Caja caja = new Caja(1,"6 set 19", new int[]{1000, 2000, 5000, 10000, 20000}, 
                new int[]{200, 200, 200, 200, 200}, m1 );
        int []prueba = new int[]{1,1,1,1,1};    
        assertEquals(true, caja.verificarDesglose(prueba, 38000));  
    }
}
