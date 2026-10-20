package String;

public class  LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"Rohith","Rogith","Rohan"};
        System.out.print(commonprefix(strs));
    }
    public static String commonprefix(String[] strs)
    {
        int indx = 0;
        String str1 = strs[0];
        String str2 = strs[1];
        String str3 = strs[strs.length-1];
        while(indx < str1.length())
        {
            if(str1.charAt(indx)  == str3.charAt(indx) && str2.charAt(indx) == str3.charAt(indx))
            {
                indx++;
            }
            else{
                break;
            }
        }

        return indx == 0 ? "" : str1.substring(0,indx);

    }
}
