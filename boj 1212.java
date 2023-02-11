import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

// 각 숫자를 2진수로 변환하기
// 맨 앞에 '0'은 빼야함

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String oct = br.readLine();
        br.close();

        StringBuilder sb = new StringBuilder();
        String []combi = { "000", "001", "010", "011", "100", "101", "110", "111" };
        for (int i = 0; i < oct.length(); i++)
        {
            int idx = oct.charAt(i) - '0';
            sb.append(combi[idx]);
        }
        if (oct.equals("0"))
            System.out.println(oct);
        else
        {
            while (sb.charAt(0) == '0')
                sb = new StringBuilder(sb.substring(1));
            System.out.println(sb);
        }
    }
}
