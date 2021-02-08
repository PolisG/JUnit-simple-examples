package Rectangle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Polis
 */
public class RectangleTest {
    
    Rectangle r;
    Rectangle[] rList = new Rectangle[5];
    
    public RectangleTest() {
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
     * Ekteleitai otan o default constructor kai oi getter methods
     * exoun ektelestei.
     */
    @Test
    public void test1() {
        r = new Rectangle();
        try {
            //assertTrue will fail if the second parameter evaluates to false (ensures that the value is true)
            assertTrue("Test 1: Oi arxikes times einai lathos.", 
				r.getWidth()==0 && r.getHeight()==0); //doste arxikes times = p.x. -4, -2 
            System.out.println("To Test-1 oloklirothike me epityxia!");
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Meta ton ypologismo tis perifereias tou orthogoniou.
     */
    @Test
    public void test2() {
        r = new Rectangle();
        try {
            assertTrue("Test 2: Oi arxikes times einai lathos.", 
                    r.getWidth()==0 && r.getHeight()==0 && r.getPerimeter()==0);
            System.out.println("To Test-2 oloklirothike me epityxia!");
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Meta tin ektelesi tou 2ou constructor.
     */
    @Test
    public void test3() {
        r = new Rectangle();
        try {
            r = new Rectangle(10,20);
            assertTrue("Test 3: Oi arxikes times einai lathos.", 
                    r.getWidth()==10 && r.getHeight()==20 && r.getPerimeter()==200);
            System.out.println("To Test-3 oloklirothike me epityxia!");
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Meta tin ektelesi tou 2ou constructor.
     */
    @Test
    public void test4() {
        r = new Rectangle();
        try {
            for(int i=0; i<5; i++) {
                rList[i] = new Rectangle(2*i,3*i);
                assertTrue("Test 4: Oi arxikes times einai lathos.", 
                        rList[i].getWidth()==2*i &&
                        rList[i].getHeight()==3*i &&
                        rList[i].getPerimeter()==6*i*i);
            }
            System.out.println("To Test-4 oloklirothike me epityxia!");
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Meta tin ektelesi ton setters.
     */
    @Test
    public void test5() {
        r = new Rectangle();
        try {
            for(int i=0; i<5; i++) {
                rList[i] = new Rectangle(2*i,3*i);
                rList[i].setWidth(7*i);
                rList[i].setHeight(11*i);
                assertTrue("Test 5: Oi allagmenes times einai lathos.", 
                        rList[i].getWidth()==7*i &&
                        rList[i].getHeight()==11*i &&
                        rList[i].getPerimeter()==77*i*i);
            }
            System.out.println("To Test-5 oloklirothike me epityxia!");
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Test of toString method, of class Rectangle.
     */
    @Test
    public void testToString() {
        r = new Rectangle();
        try {
            for(int i=0; i<5; i++) {
                rList[i] = new Rectangle(2*i,3*i);
                rList[i].setWidth(7*i);
                rList[i].setHeight(11*i);
                assertTrue("Test 6: Oi allagmenes times einai lathos.", 
                        rList[i].getWidth()==7*i &&
                        rList[i].getHeight()==11*i &&
                        rList[i].getPerimeter()==77*i*i);
                System.out.println(rList[i]);
            }
            System.out.println("To Test-6 oloklirothike me epityxia!");
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("Rectangle.RectangleTest");
    }
    
}
