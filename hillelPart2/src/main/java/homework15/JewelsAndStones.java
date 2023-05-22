package homework15;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JewelsAndStones {


    public int jewelsFinder(String jewels, String stones) {
        if (Objects.equals(jewels, null) || Objects.equals(stones, null)) {
            return 0;
        }
        int counter = 0;
        List<Character> stoneFilter = new ArrayList<>();
        for (char jewel : jewels.toCharArray()) {
            stoneFilter.add(jewel);
        }
        for (char stone : stones.toCharArray()) {
            if (stoneFilter.contains(stone)) counter++;
        }
        return counter;
    }
}
