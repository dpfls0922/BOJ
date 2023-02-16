import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.StringTokenizer;

public class Main {

    public static int N;
    public static int M;
    public static int [][]map;
    public static int ans = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++)
        {
            String str = br.readLine();
            for (int j = 0; j < M; j++)
                map[i][j] = str.charAt(j) - '0';
        }
        br.close();

        // 시작할 수 있는 칸의 행과 열(x, y)을 매개변수로 전해줌
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                f(i, j);
        System.out.println(ans);
    }

    public static void f(int row, int col)
    {
        for (int i = -N; i < N; i++)       // i는 행의 등차
        {
            for (int j = -M; j < M; j++)   // j는 열의 등차
            {
                if (i == 0 && j == 0) continue;  // 행의 등차와 열의 등차 모두가 0이라면 똑같은 칸을 가리킴

                int x = col;
                int y = row;
                int sqr = 0;
              
               // 등차가 범위 내에서 증감하며 판별할 제곱수의 자릿수를 하나씩 추가
               // (1,1) (1,2), (1,3)이 수열의 완성이라 해도, (1,1)일 때 검사, (1,1),(1,2)일때도 검사, (1,1),(1,2),(1,3)일 때 검사해야 함
                while (0 <= x && x < M && 0 <= y && y < N)
                {
                    // 제곱수 생성 > 제곱수 판별 > 최댓값 갱신
                    sqr = sqr * 10 + map[y][x];
                    if (is_Squre(sqr))
                        ans = Math.max(ans, sqr);
                    x += j;
                    y += i;
                }
            }
        }
    }
  
    public static boolean is_Squre(int n)
    {
        int root = (int) Math.sqrt(n);
        if (root * root == n)
            return (true);
        return (false);
    }
}
