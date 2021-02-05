package Employee;

/**
 *
 * @author Polis
 */
public class Employee {
    private String name;
    private int empID;
    private int salary;

    public Employee(String name, int empID, int salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }
    
    public boolean equals(Object obj) {
        Employee emp = (Employee)obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(emp.name)
                && this.empID == emp.empID
                && this.salary == emp.salary){
            status = true;
        }
        return status;
    }
    
    public static String getEmpNameWithHighestSalary() {
        /**
         * logic to get Highest paid employee
         */
        return "John";
    }
    
    public static Employee getHighestPaidEmployee() {
        /**
         * hiding logic to get highest paid employee
         */
        return new Employee("John", 1, 15000);
    }
    
    @Override
    public int hashCode() {
        return this.empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
