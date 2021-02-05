package Box;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Polis
 */
public class BoxTest {
    
    Box myBox;
    
    public BoxTest() {
    }
    
    @Before
    public void setUp() {
        // Ekteleitai prin apo kathe test.
        System.out.println("Test initialization.");
    }
    
    @After
    public void tearDown() {
        // Ekteleitai meta apo kathe test.
        System.out.println("Test has finished."+"\n");
    }

    /**
     * Test of getVolume method, of class Box.
     */
    @Test
    public void test1() {
        myBox = new Box(10, 20, 15);
        try {
            //assertTrue will fail if the second parameter evaluates to false (ensures that the value is true)
            assertTrue("Test 1: check volume of box(10w, 20h, 15d).", 
				myBox.getVolume()==3000);
            System.out.println("To Test-1 oloklirothike me epityxia!");
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Test of getVolume method, of class Box.
     */
    @Test
    public void test2() {
        myBox = new Box(3, 6, 9);
        try {
            //assertTrue will fail if the second parameter evaluates to false (ensures that the value is true)
            assertTrue("Test 2: check volume of box(3w, 6h, 9d).", 
				myBox.getVolume()==162);
            System.out.println("To Test-2 oloklirothike me epityxia!");
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
    
}
