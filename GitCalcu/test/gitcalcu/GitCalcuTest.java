/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package gitcalcu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fredy
 */
public class GitCalcuTest {
    
    public GitCalcuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class GitCalcu.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double unNumero = 150.0;
        double otroNumero = 180.0;
        GitCalcu instance = new GitCalcu();
        double expResult = 330.0;
        double result = instance.sumar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of restar method, of class GitCalcu.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double unNumero = 90.0;
        double otroNumero = 50.0;
        GitCalcu instance = new GitCalcu();
        double expResult = 40.0;
        double result = instance.restar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of multiplicar method, of class GitCalcu.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double unNumero = 80.0;
        double otroNumero = 3.0;
        GitCalcu instance = new GitCalcu();
        double expResult = 240.0;
        double result = instance.multiplicar(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of dividir method, of class GitCalcu.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double unNumero = 330.0;
        double otroNumero = 3.0;
        GitCalcu instance = new GitCalcu();
        double expResult = 110.0;
        double result = instance.dividir(unNumero, otroNumero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
