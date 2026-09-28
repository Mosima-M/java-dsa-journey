package dsa.methods;
public class Sign {
    // return "positive", "negative", or "zero"
    public static String sign(int n) {
        if(n <0){
            return "negative";
        }
        else if(n > 0){
            return "positive";
        }else
        return "zero";
    }

    public static void main(String[] args) {
        System.out.println(sign(0));
    }
}
