package homework15;

public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        char chr;
        for (int i = 0; i < text.length(); i++) {
            chr = text.charAt(i);
            switch (chr) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }
        }
        l /= 2;
        o /= 2;
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}
