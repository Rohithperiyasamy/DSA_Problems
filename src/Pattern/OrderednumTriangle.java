package Pattern;

public class OrderednumTriangle {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)
                System.out.print(" ");
                for(int k = 1; k <= (2 * i - 1); k++)
                    System.out.print(num++ +" ");
            System.out.println();
        }

    }


}
