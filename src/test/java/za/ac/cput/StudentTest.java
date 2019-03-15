package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void student(){
        Student stud = new Student("Tina Kabai", 215203569, "Application Development", 65000);

        Assert.assertEquals("Tina Kabai", stud.getName());
    }
}
