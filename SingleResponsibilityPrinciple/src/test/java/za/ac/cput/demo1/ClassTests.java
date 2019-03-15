package za.ac.cput.demo1;

import org.junit.Assert;
import org.junit.Test;

public class ClassTests {

    @Test
    public void details(){
        Details d = new Details();
        String studName = "Yola Mxegwana, YM201796, Multimedia, Meghan";

        Assert.assertEquals(studName, d.info("Yola Mxegwana, ", "YM201796, ","Multimedia, ", "Meghan"));

    }
    @Test
    public void marks(){
        Marks m = new Marks();

        Assert.assertNotEquals(70, m.marks(85));
    }
}
