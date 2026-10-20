package Interviewpreps;

import java.util.Scanner;

public class PairOfShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyln = sc.nextLine();
        String[] key = keyln.split(" ");
        char[] keys = new char[key.length];
        for(int i = 0; i < key.length; i++)
        {
            keys[i] = key[i].charAt(0);
        }
        String num = sc.nextLine();
        String[] nums = num.split(" ");
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            arr[i] = Integer.parseInt(nums[i]);
        }
        for(char keyv : keys)
        {
            int val = charValue(keyv);
            boolean valid = true;
            for(int n : arr)
            {
                int x = n - val;
                if(x < 1 || x > 26)
                {
                    valid = false;
                    break;
                }
            }
            if(valid)
            {
                for(int n : arr)
                {
                    int x = n - val;
                    System.out.print(numtoChar(x));
                }
                break;
            }
        }


    }
    static int charValue(char c)
    {
        return Character.toUpperCase(c) - 'A' + 1;
    }
    static char numtoChar(int c)
    {
        return (char)('A' + c - 1);
    }
}

