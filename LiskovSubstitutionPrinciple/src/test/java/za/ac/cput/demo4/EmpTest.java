package za.ac.cput.demo4;

import org.junit.Assert;
import org.junit.Test;

public class EmpTest {
    @Test
    public void employee(){
        Employee emp1 = new Employee("Busi", 2020201590, "Network Administrator");
        Employee emp2 = new Employee("Yola", 2020201696, "Web Designer");

        Assert.assertNotEquals(emp1, emp2);
    }
}
