// 메모리 초과

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int k = Integer.parseInt(str.nextToken());
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++)
            sb.append(i);
        System.out.println(sb.capacity());
        System.out.print(sb.charAt(k - 1));
    }
}


// 규칙으로 자릿수 찾기
// 숫자를 문자열로 바꾼 뒤, 인덱스로 값을 참조하게 함
// 자료형 long 주의

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        br.close();

        long tmp_k = K;
        long len = 1;
        long num_cnt = 9;
        long res = 0;
        while (tmp_k > num_cnt * len) {
            tmp_k -= num_cnt * len;
            res += num_cnt;
            num_cnt *= 10;
            len++;
        }
        res = (res + 1) + ((tmp_k - 1) / len);
        if (res > N)
            System.out.println(-1);
        else
        {
            int idx = (int)((tmp_k - 1) % len);
            System.out.println(String.valueOf(res).charAt(idx));
        }
    }
}
