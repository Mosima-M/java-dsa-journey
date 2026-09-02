package dsa.methods;
public class Sign {
    // return "positive", "negative", or "zero"
    public static String sign(int n) {
        String result = (n > 0) ? "positive" : n == 0 ? "zero" : "negative";
        return result;
    }
}
