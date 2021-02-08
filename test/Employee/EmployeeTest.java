package Employee;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Polis
 */
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of getEmpNameWithHighestSalary method, of class Employee.
     */
    @Test
    public void testGetEmpNameWithHighestSalary() {
        String expectedName = "John";
        assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
    }

    /**
     * Test of getHighestPaidEmployee method, of class Employee.
     */
    @Test
    public void testGetHighestPaidEmployee() {
        Employee expectedEmpObj = new Employee("John", 1, 15000);
        assertEquals(expectedEmpObj, Employee.getHighestPaidEmployee());
    }
    
    public static void main(String args[]){
        org.junit.runner.JUnitCore.main("Employee.EmployeeTest");
    }
}
