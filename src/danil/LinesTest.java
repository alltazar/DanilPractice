package danil;

import org.junit.Test;
import org.junit.Assert;

public class LinesTest {

    @Test
    public void linesTest()
    {
        Lines line1 = new Lines(2,3,1,2);
        Lines line2 = new Lines(1,4,3,3);

        Assert.assertFalse(Lines.dot(line1,line2));

        Lines line3 = new Lines(2,3,1,2);
        Lines line4 = new Lines(1,4,2,3);

        Assert.assertTrue(Lines.dot(line3,line4));

        Lines line5 = new Lines(3,2,5,2);
        Lines line6 = new Lines(1,4,3,3);

        Assert.assertFalse(Lines.dot(line5,line6));

        Lines line7 = new Lines(7,7,8,6);
        Lines line8 = new Lines(8,7,6,4);

        Assert.assertTrue(Lines.dot(line7,line8));

        Lines line9 = new Lines(4,8,5,9);
        Lines line10 = new Lines(2,9,5,9);

        Assert.assertTrue(Lines.dot(line9,line10));

        Lines line11 = new Lines(2,9,5,9);
        Lines line12 = new Lines(2,8,5,8);

        Assert.assertFalse(Lines.dot(line11,line12));

    }

}
