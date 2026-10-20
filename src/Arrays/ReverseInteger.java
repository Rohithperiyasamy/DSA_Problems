package Arrays;
public class ReverseInteger {
    public static void main(String[] args)
    {
        int n = 123;
        int temp = n;
        int digit = 0;
        int rev = 0,sum = 0;
        while(n != 0)
        {
            digit = n % 10;
            rev = (rev * 10) + digit;
            System.out.println(rev);
            n /= 10;
        }
        System.out.println(rev);
        if(temp == rev)
        {
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("its not palindrome");
        }
    }
}
