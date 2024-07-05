// 풀이 - 1
// 메모리 15644KB 시간 1084ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b, n;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            n = 1;

            for (int j = 0; j < b; j++)
                n = (n * a) % 10;
            if (n == 0) n = 10;
            System.out.println(n);
        }
        br.close();
    }
}

// 풀이 - 2 (제곱의 규칙을 찾아 푸는 방법)
// 메모리 14372KB 시간 156ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b, c, res;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = 0;
            res = 1;

            if (a % 10 == 0 || a % 10 == 1 || a % 10 == 5 || a % 10 == 6)
                res = a % 10;
            else if (a % 10 == 4 || a % 10 == 9)
                c = (b % 2 == 1) ? 1 : 2;
            else
                c = (b % 4 == 0) ? 4 : b % 4;
            for (int j = 0; j < c; j++)
                res = (res * a) % 10;
            if (res == 0) res = 10;
            System.out.println(res);
        }
        br.close();
    }
}
