package homework15;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {


    @Test
    public void jewelsFinderTest() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expectedResult = 3;
        int actualResult = jewelsAndStones.jewelsFinder(jewels, stones);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void jewelsFinderTestWithNullArgument() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        String jewels = null;
        String stones = "aAAbbbb";
        int expectedResult = 0;
        int actualResult = jewelsAndStones.jewelsFinder(jewels, stones);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
