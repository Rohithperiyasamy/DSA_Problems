package Interviewpreps;

public class ShortestWordDistance {
    public static void main(String[] args) {
        String[] words = {"the", "quick", "brown", "fox", "quick","rohith", "MCA",
        "Class", "food","the","rohith", "MCA",
                "Class", "food","Rose","Boys","fox"};
        String book1 = "the";
        String book2 = "fox";
        System.out.println(shortestworddistance(words,book1,book2));
    }
    public static int shortestworddistance(String[] words, String book1, String book2)
    {
        int res = Integer.MAX_VALUE;
        int a = -1;
        int b = -1;
        for(int i = 0; i < words.length; i++)
        {
            if(words[i].equals(book1))
            {
                a = i;
            }
            else if(words[i].equals(book2))
            {
                b = i;
            }
            if(a != -1 && b != -1)
            {
                res = Math.min(res,Math.abs(a - b));
            }
        }
        return res;
    }
}
