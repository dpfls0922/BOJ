import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.StringTokenizer;

public class Main {

    public static int minPaint(char [][]arr, int x, int y)
    {
        int cnt = 0;
        // 맨 처음이 'W'로 시작해야 하는 보드
        char color = 'W';

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // 보드가 잘못되어 있다면 다시 색칠해야 하는 정사각형의 수를 카운트함
                if (arr[i][j] != color) cnt++;
                if (color == 'W') color = 'B';
                else color = 'W';
            }
            // 한 줄이 바뀌면 바로 위에 있는 색과 반대여야 함
            if (color == 'W') color = 'B';
            else color = 'W';
        }
        // 맨 처음이 'W일 때와 'B'일 때 칠해야 하는 정사각형의 수 중 최소값을 반환
        return (Math.min(cnt, 64 - cnt));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char [][]arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++)
                arr[i][j] = str.charAt(j);
        }
        br.close();

        int min = 64;
        for (int i = 0; i < N - 7; i++)
            for (int j = 0; j < M - 7; j++)
                // 최소값 갱신
                min = Math.min(min, minPaint(arr, i, j));
        System.out.println(min);
    }
}
