package Basic;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibon(n));
    }
    static int fibon(int n)
    {
        if(n < 2)
        {
            return 1;
        }
        return fibon(n-1) + fibon(n-2);
    }
}
