package Basic;
public class Armstrong {
    public static void main(String[] args) {

        int n = 200;
        for (int i = 1; i <= n; i++) {
            if (Isarm(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean Isarm(int num) {
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }
        return sum == temp;
    }
}
