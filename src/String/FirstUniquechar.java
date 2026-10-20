package String;

public class FirstUniquechar {
    public static void main(String[] args) {
        String s = "swiss";
        char ch = uniqchar(s);

        System.out.println(uniqchar(s));

    }
    static char uniqchar(String s)
    {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        for(int i = 0; i  <= s.length()-1; i++){
            if(freq[s.charAt(i) - 'a'] == 1)
            {
                return s.charAt(i);
            }
        }
        return 0;
    }
}
