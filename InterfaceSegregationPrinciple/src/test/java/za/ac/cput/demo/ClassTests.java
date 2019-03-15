package za.ac.cput.demo;

import org.junit.Assert;
import org.junit.Test;

public class ClassTests {
    @Test
    public void rabbit(){
        Rabbits r = new Rabbits();

        Assert.assertNotEquals("Runs", r.run());
    }
    @Test
    public void lion(){
        Lions l = new Lions();

        Assert.assertSame("Lion is roaring.", l.roar());
    }
}
