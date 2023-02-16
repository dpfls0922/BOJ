import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class Main {
    public static int[] board;
    public static int N;
    public static int cnt = 0;
    public static boolean queen_valid(int row)
    {
        for (int i = 0; i < row; i++)
        {
            if (board[i] == board[row])
                return (false);
            else if (Math.abs(i - row) == Math.abs(board[i] - board[row]))
                return (false);
        }
        return (true);
    }
    public static void make_board(int row)
    {
        if (row == N) {
            cnt++;
            return;
        }
        for (int i = 0; i < N; i++)
        {
            board[row] = i;
            if (queen_valid(row))
                make_board(row + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        br.close();
        board = new int[N];

        make_board(0);
        System.out.println(cnt);
    }
}
