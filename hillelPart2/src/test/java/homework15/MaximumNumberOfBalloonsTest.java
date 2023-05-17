package homework15;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfBalloonsTest {

    @Test
    public void maxNumberOfBalloonsTest() {
        MaximumNumberOfBalloons maximumNumberOfBalloons = new MaximumNumberOfBalloons();
        String text = "loonbalxballpoon";
        int expectedResult = 2;
        int actualResult = maximumNumberOfBalloons.maxNumberOfBalloons(text);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
