package String;

public class GCDofStrings {
    static void main() {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.print(gcdOfStr(str1,str2));
    }
    static String gcdOfStr(String str1, String str2){
        if(!(str1+str2).equals(str2+str1)) return "";
        int gcdstr = gcd(str1.length(),str2.length());
        return str1.substring(0,gcdstr);
    }
    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
