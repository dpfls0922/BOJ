import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int is_valid(String[] arr, int N, int M)
    {
        int len = 0;

        for (int i = 0; i < N; i++)
            if (arr[i].length() != M)
                return (0);
        return (1);
    }
    static void reverseArr(String[] arr, int x, int y)
    {
        for (int i = x; i < x + 3; i++)
        {
            char []chars = arr[i].toCharArray();
            for (int j = y; j < y + 3; j++)
                chars[j] = chars[j] == '0' ? '1' : '0';
            arr[i] = String.valueOf(chars);
        }
    }

    static int is_match(String[] arr, String[] brr, int N)
    {
        for (int i = 0; i < N; i++)
            if (!arr[i].equals(brr[i]))
                return (0);
        return (1);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(s.nextToken());
        int M = Integer.parseInt(s.nextToken());

        String []arr = new String[N];
        String []brr = new String[N];
        for (int i = 0; i < N; i++)
            arr[i] = br.readLine();
        for (int i = 0; i < N; i++)
            brr[i] = br.readLine();
        br.close();

        if (is_valid(arr, N, M) != 1 || is_valid(brr, N, M) != 1)
        {
            System.out.println(-1);
            return ;
        }
        int cnt = 0;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                if (arr[i].charAt(j) != brr[i].charAt(j) && i + 2 < N && j + 2 < M)
                {
                    reverseArr(arr, i, j);
                    cnt++;
                }
            }
        }
        if (is_match(arr, brr, N) != 1)
            System.out.println(-1);
        else
            System.out.println(cnt);
    }
}
