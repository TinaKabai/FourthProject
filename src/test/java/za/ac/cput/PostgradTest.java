package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

public class PostgradTest {
    @Test
    public void post(){
        Postgrad pg = new Postgrad("Yola Mxegwana", 217203569, "Multimedia", 25000);

        Assert.assertEquals("Multimedia", pg.getCourse());
    }
}
