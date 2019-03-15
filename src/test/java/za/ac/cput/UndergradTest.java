package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

public class UndergradTest {
    @Test
    public void under(){
        Undergrad ug = new Undergrad("Anati Jack", 216203569, "Computer Networks", 45000);

        Assert.assertEquals("Student details: \n",45000, ug.getLoanAmount(), 1);

        //
        Assert.assertNotEquals(ug, super.toString());
    }
}
