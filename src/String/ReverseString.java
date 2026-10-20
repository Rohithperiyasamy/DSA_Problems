package String;

public class ReverseString {
    public static void main(String[] args)
    {
        String s = "malayalams";
        String reversestr = "";

        System.out.println("Original:"+s);
        for(int i = s.length()-1; i >= 0; i--)
        {
            reversestr +=  s.charAt(i);
        }
    if(s.equals(reversestr))
    {
        System.out.println("Its Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }

    }
}
