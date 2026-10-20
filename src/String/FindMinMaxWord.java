package String;

public class FindMinMaxWord {
    public static void main(String[] args) {
        String str = "Rohith is a Software Engineer, He is working at Top tech company in India";

        String[] arr = str.split("s//+");
        String min = arr[0];
        String max = arr[0];
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            if (s.length() < min.length()) {
               // min = s;
                sb.append(s);
            }
            if (s.length() > max.length()) {
               // max = s;
                sb.append(s);
            }
        }
        System.out.println(sb);
    }
}
