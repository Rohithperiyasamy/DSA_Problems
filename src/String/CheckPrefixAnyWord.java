package String;

public class CheckPrefixAnyWord {
    public static void main(String[] args) {
        String sentence = "I like burger and biriyani";
        String searchWord = "burg";
        System.out.println(checkPrefixAnyWord(sentence,searchWord));
    }
    public static int checkPrefixAnyWord(String sentence, String searchWord)
    {
        String[] s = sentence.split(" ");
        for(int i = 0; i < s.length; i++)
        {
            if(s[i].startsWith(searchWord))
            {
                return i+1;
            }
        }
        return -1;
    }
}
