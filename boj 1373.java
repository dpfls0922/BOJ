import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

// 2진수 -> 8진수
// 세 자리씩 끊어서 10진수로 변환하면 8진수가 됨

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine();
        br.close();

        int len = binary.length();
        if (len % 3 == 1)
            System.out.print(binary.charAt(0));
        else if (len % 3 == 2)
            System.out.print((binary.charAt(0) - '0') * 2 + (binary.charAt(1) - '0'));
        for (int i = len % 3; i < len; i += 3)
            System.out.print((binary.charAt(i) - '0') * 4 + (binary.charAt(i + 1) - '0') * 2 + (binary.charAt(i + 2) - '0'));
    }
}
