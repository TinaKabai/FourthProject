package za.ac.cput.demo5;

import org.junit.Assert;
import org.junit.Test;

public class IdentityTest {
    @Test
    public void n(){
        Identity i = new Identity();
        i.names("Tina", "Yola");
        i.student("Student 1","Student 2");

        Marks m = new Marks();
        m.mark(75,100);

        Assert.assertNotEquals(i.student("Student 1", "Student 2"), i.names("Tina", "Yola"));
        Assert.assertEquals(175,m.mark(75,100));
    }
}
