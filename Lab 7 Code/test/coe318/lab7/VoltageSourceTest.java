/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aypatel
 */
    
public class VoltageSourceTest {
    
    //Instance variables needed for the VoltageTest class
    Node node1 = new Node();
    Node node2 = new Node();
    VoltageSource voltSource = new VoltageSource(25, node1, node2);
    Node[] nodeSource = voltSource.getNodes();
    
    public VoltageSourceTest() {
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
     * Test of getNodes method, of class Voltage.
     */
    @Test
    public void testGetNodes() {
        
        System.out.println("getNodes");
        VoltageSource instance = voltSource;
        Node[] expResult = nodeSource;
        Node[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Voltage.
     */
    @Test
    public void testToString() {
        
        System.out.println("toString");
        VoltageSource instance = voltSource;
        String result = instance.toString();
        assertTrue(result.contains("V2 2 3 DC 25.0"));
        
    }
}