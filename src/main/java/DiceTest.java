import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void tossTest1() {
        Dice dice = new Dice(1);
        Integer actual = dice.tossAndSum();
        Integer min = 1;
        Integer max = 6;

        Assert.assertTrue(actual >= min && actual <= max);
    }

    @Test
    public void tossTest2() {
        Dice dice = new Dice(2);
        Integer actual = dice.tossAndSum();
        Integer min = 2;
        Integer max = 12;

        Assert.assertTrue(actual >= min && actual <= max);
    }

    @Test
    public void tossTest3() {
        Dice dice = new Dice(3);
        Integer actual = dice.tossAndSum();
        Integer min = 3;
        Integer max = 18;

        Assert.assertTrue(actual >= min && actual <= max);
    }

    @Test
    public void tossTest4() {
        Dice dice = new Dice(4);
        Integer actual = dice.tossAndSum();
        Integer min = 4;
        Integer max = 24;

        Assert.assertTrue(actual >= min && actual <= max);
    }








}