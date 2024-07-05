import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.StringTokenizer;

// mCn 문제로, boj 11050.java 문제의 상위 버전

public class Main {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            dp = new int[M + 1][N + 1];
            System.out.println(BC(M, N));
        }
    }

    static int BC(int N, int K) {
        if (dp[N][K] > 0)
            return (dp[N][K]);
        if (K == N || K == 0)
            return (dp[N][K] = 1);
        return (dp[N][K] = BC(N - 1, K - 1) + BC(N - 1, K));
    }
}
