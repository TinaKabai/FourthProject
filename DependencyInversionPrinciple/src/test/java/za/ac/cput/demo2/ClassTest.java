package za.ac.cput.demo2;

import org.junit.Assert;
import org.junit.Test;

public class ClassTest {
    @Test
    public void post(){
        Postgrad pg = new Postgrad("Yola Mxegwana", 217203569, "Multimedia", 25000);

        Assert.assertNotEquals("Yola Mxegwana", pg.interest());
    }
}
