package String;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "naragam";
        System.out.println(anagram(s1,s2));
    }
    //method 1
    static boolean anagram(String s1, String s2)
    {
        if(s1.length() != s2.length()) return false;
        int[] freq = new int[26];

        for(int i = 0; i <= s1.length()-1; i++)
        {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            //if(ch1 < 'a' || ch1 > 'z' || ch2 < 'a' || ch2 > 'z')  return false;
        freq[ch1 - 'a']++;
        freq[ch2 - 'a']--;
        }
        for(int c : freq)
        {
            if(c != 0)
            {
                return false;
            }
        }
        return true;

    }
}
