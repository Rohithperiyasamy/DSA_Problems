package Interviewpreps;
import java.util.*;
public class MyteryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int R = sc.nextInt();
        int digitsum = Digit(n);
        int product = digitsum * R;
        while(product > 10){
            product = Digit(product);
        }
        System.out.println(product);

    }
    static int Digit(int n)
    {
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
