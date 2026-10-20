package Basic;

public class Prime {
    public static void main(String[] args) {
        int n = 100;
        for(int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            } //else {
              //  System.out.println("Not a Prime");
            // }
        }
    }
    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

