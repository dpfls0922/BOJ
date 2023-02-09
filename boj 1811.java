import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String []words = new String[N];

        sc.nextLine();

        for (int i = 0; i < N; i++)
            words[i] = sc.nextLine();

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length())
                    return s1.compareTo(s2);
                else
                    return s1.length() - s2.length();
            }
        });

        System.out.println(words[0]);

        for (int i = 1; i < N; i++)
        {
            if (!words[i].equals(words[i - 1]))
                System.out.println(words[i]);
        }
        sc.close();
    }
}
