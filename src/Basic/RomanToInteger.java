package Basic;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanint(s));
    }
    static int romanint(String s)
    {
        int[] value = new int[126];
        value['I'] = 1;
        value['V'] = 5;
        value['X'] = 10;
        value['L'] = 50;
        value['C'] = 100;
        value['D'] = 500;
        value['M'] = 1000;
        int prev = 0;
        int curr = 0;
        int total = 0;
        for(int i = 0; i < s.length(); i++)
        {
            curr = value[s.charAt(i)];
            if(curr < prev)
            {
                total -= curr;
            }
            else{
                total += curr;
            }
            prev = curr;
        }
        return total;
    }
}
