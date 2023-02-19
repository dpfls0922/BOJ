import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String []str = new String[T];
        for (int i = 0; i < T; i++)
            str[i] = br.readLine();
        br.close();

        StringBuilder sb = new StringBuilder(str[0]);
        for (int i = 1; i < T; i++)
            for (int j = 0; j < str[0].length(); j++)
                if (str[0].charAt(j) != str[i].charAt(j))
                    sb.setCharAt(j, '?');
        System.out.println(sb);
    }
}
