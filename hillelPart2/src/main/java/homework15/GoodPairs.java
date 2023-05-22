package homework15;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {

    public int searchGoodPairs(int[] numbers) {
        Map<Integer, Integer> pairsFinder = new HashMap<>();
        int goodPairs = 0;

        for (int number : numbers) {
            int count = pairsFinder.getOrDefault(number, 0);
            goodPairs += count;
            pairsFinder.put(number, count + 1);
        }
        return goodPairs;
    }
}
