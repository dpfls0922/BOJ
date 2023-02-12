import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.StringTokenizer;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        String b1 = s.nextToken();
        String b2 = s.nextToken();
        br.close();

        int carry = 0;
        int len1 = b1.length();
        int len2 = b2.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min(len1, len2); i++)
        {
            int first = b1.charAt(len1 - 1 - i) - '0';
            int second = b2.charAt(len2 - 1 - i) - '0';

            if (first + second + carry == 2)
            {
                sb.append(0);
                carry = 1;
            }
            else if (first + second + carry == 3)
            {
                sb.append(1);
                carry = 1;
            }
            else
            {
                sb.append(first + second + carry);
                carry = 0;
            }
        }
        for (int i = max(len1, len2) - min(len1, len2) - 1; i >= 0; i--)
        {
            if (len1 > len2)
            {
                if (b1.charAt(i) - '0' + carry == 2)
                {
                    sb.append(0);
                    carry = 1;
                }
                else
                {
                    sb.append(b1.charAt(i) + carry - '0');
                    carry = 0;
                }
            }
            else
            {
                if (b2.charAt(i) - '0' + carry == 2)
                {
                    sb.append(0);
                    carry = 1;
                }
                else
                {
                    sb.append(b2.charAt(i) + carry - '0');
                    carry = 0;
                }
            }
        }
        if (carry != 0)
            sb.append(carry);

        sb.reverse();
        while (sb.charAt(0) == '0' && sb.length() != 1)
            sb = new StringBuilder(sb.substring(1));
        System.out.println(sb);
    }
}
