package homework15;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairsTest {

    @Test
    public void searchGoodPairsTest() {
        GoodPairs goodPairs = new GoodPairs();
        int[] numbers = {1, 1, 1, 1};
        int expectedResult = 6;
        int actualResult = goodPairs.searchGoodPairs(numbers);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void searchGoodPairsTestWithEmptyArray() {
        GoodPairs goodPairs = new GoodPairs();
        int[] numbers = {};
        int expectedResult = 0;
        int actualResult = goodPairs.searchGoodPairs(numbers);

        Assert.assertEquals(expectedResult, actualResult);

    }
}
