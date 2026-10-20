package String;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(words(s));
    }
    static String words(String s)
    {
        String[] word = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = word.length-1; i >= 0; i--)
        {
            sb.append(word[i]);
            sb.append(" ");

        }
        return sb.toString().trim();
    }
}
