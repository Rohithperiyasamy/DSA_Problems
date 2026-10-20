package String;



public class CheckPalindrome
{
    public static void main(String[] args)
    {
       String s  = "Malayalam";
System.out.println(checkpalin(s));
    }
    static boolean checkpalin(String s)
    {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;

    }
}
