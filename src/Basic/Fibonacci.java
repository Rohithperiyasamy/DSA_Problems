package Basic;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 3, second = 5;
        int n = 10;
        int next = 0;
        for(int i = 0; i < n; i++){

            next = first + second;
            first = second;
            second = next;
        }
    }
}
