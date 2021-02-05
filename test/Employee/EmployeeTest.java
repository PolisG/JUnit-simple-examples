package Employee;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Polis
 */
public class EmployeeTest {
    
    public EmployeeTest() {
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
    
}
