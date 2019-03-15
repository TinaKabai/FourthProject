package za.ac.za.demo3;

import org.junit.Assert;
import org.junit.Test;

public class ClassTest {
    @Test
    public void details(){
        PersonalDetails ps = new PersonalDetails(1500);

        Assert.assertEquals(1500.00, ps.getAllowance(), 1);
    }
}
