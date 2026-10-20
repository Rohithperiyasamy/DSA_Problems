package SlidingWindow;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        String s = "ADBD";
        int k = 1;
        System.out.println(longsubcharreplaced(s,k));
    }
    static int longsubcharreplaced(String s, int k)
    {
        int[] freq = new int[26];
        int maxwindow = 0;
        int maxfreq =  0;
        int left = 0;
        for(int right = 0; right < s.length(); right++)
        {
            freq[s.charAt(right) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);
            int windowlen = right - left + 1;
            if(windowlen - maxfreq > k)
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            windowlen = right - left + 1;
            maxwindow = Math.max(maxwindow, windowlen);
        }
        return maxwindow;
    }
}
