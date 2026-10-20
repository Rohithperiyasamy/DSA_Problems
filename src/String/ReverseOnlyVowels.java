package String;

public class ReverseOnlyVowels {
    public static void main(String[] args) {
        String s = "geekforrohith";
        System.out.println("Original :"+ s);

        System.out.println("Result: "+revrseOnlyVowels(s));
    }
    static String revrseOnlyVowels(String s){
        char[] c = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int left = 0;
        int right = c.length-1;
        while (left < right) {
            while (left < right && vowels.indexOf(c[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(c[right]) == -1) {
                right--;
            }
            if (left < right) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
return new String(c);
    }
}
