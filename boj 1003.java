import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class Main {
    public static int [][]dp = new int[41][2];
    public static int []fibonacci(int n)
    {
        if (dp[n][0] == 0 && dp[n][1] == 0)
        {
            dp[n][0] = fibonacci(n - 2)[0] + fibonacci(n - 1)[0];
            dp[n][1] = fibonacci(n - 2)[1] + fibonacci(n - 1)[1];
        }
        return dp[n];
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 0; i < N; i++)
        {
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            sb.append(dp[n][0] + " " + dp[n][1] + "\n");
        }
        br.close();
        System.out.println(sb);
    }
}
