import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest{

    @Test
    public void getBinTest() {
        Bins bin = new Bins(2, 12);
        Integer expected = 0;
        Integer actual = bin.getBin(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinTest() {
        Bins bin = new Bins(2, 12);
        Integer expected = 1;
        bin.incrementBin(2);
        Integer actual = bin.getBin(2);

        Assert.assertEquals(expected, actual);


    }
}