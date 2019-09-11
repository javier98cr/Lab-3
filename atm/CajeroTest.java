

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * The test class CajeroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CajeroTest
{
    /**
     * Default constructor for test class CajeroTest
     */
    public CajeroTest()
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
    public void testRetirar()
    {
        Cajero cajero1 = new Cajero("15 de setiembre del 2019");
        cajero1.instancieCajas();
        cajero1.instancieClientes();
        assertEquals(true, cajero1.retiro(30000, 123, 1));
    }

    @Test
    public void testRetirar2()
    {
        Cajero cajero1 = new Cajero("16 de setiembre del 2017");
        cajero1.instancieClientes();
        cajero1.instancieCajas();
        assertEquals(false, cajero1.retiro(600000, 123, 1)); // Sacar mas de lo que se tiene
    }

    @Test // Cargar el dinero en el cajero - 1
    public void testVerificaMontoCaja(){
        Cajero cajero1 = new Cajero("17 de octubre del 2002");
        Moneda m1 = new Moneda(1, "Colon", 1.0, "24 de junio - 1998");
        Moneda m2 = new Moneda(2, "Dolar", 582.0, "24 de junio - 1997");    
        cajero1.setCaja(new int[]{1000,2000,5000,10000,20000,50000}, new int []{200,150,100,75,50,30}, m1);
        cajero1.setCaja(new int[]{1,5,10,20,50,100}, new int []{18000,18000,17000,17000,16000,16000}, m2);
        assertEquals(true, cajero1.verificarMontoCajero(3000000));
    }
    
    @Test // Estado de cajero - 2
    public void testEstadoCajero(){
        Cajero cajero1 = new Cajero("15 de setiembre del 2019");
        cajero1.instancieClientes();
        Moneda m1 = new Moneda(1, "Colon", 1.0, "24 de junio - 1998");
        cajero1.setCaja(new int[]{1000,2000,5000,10000,20000,50000}, new int []{50,50,50,50,50,50}, m1);
        cajero1.retiro(112000, 123, 0);
        int []prueba = new int[]{50,49,50,49,50,48};    
        Assert.assertArrayEquals(prueba,cajero1.deCierreCaja(1));
    }
}


