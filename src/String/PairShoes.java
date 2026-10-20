package String;

import java.util.HashMap;
import java.util.Scanner;

public class PairShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] shoes = new String[n];
        for(int i = 0; i < n; i++)
        {
            shoes[i] = sc.next();
        }
        HashMap<String,int[]> map = new HashMap<>();
        for(String shoe : shoes) {
            String size = shoe.substring(0, shoe.length() - 1);
            char side = shoe.charAt(shoe.length() - 1);

            if (!map.containsKey(size)) {
                map.put(size, new int[2]);
            }
            if (side == 'L') {
                map.get(size)[0]++;

            } else {
                map.get(size)[1]++;
            }
        }
        int totalPairs = 0;
        for(String size:map.keySet())
        {
            int left = map.get(size)[0];
            int right = map.get(size)[1];
            totalPairs += Math.min(left,right);
        }

        System.out.print(totalPairs);
    }
}

