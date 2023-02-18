// 풀이 - 1
// 시간 초과로 실패 O(n^2)

   static int N;
   static int []Nnum;

   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       N = Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine());
       Nnum = new int[N];
       for (int i = 0; i < N; i++)
           Nnum[i] = Integer.parseInt(st.nextToken());

       int M = Integer.parseInt(br.readLine());
       st = new StringTokenizer(br.readLine());
       int[] Mnum = new int[M];
       for (int i = 0; i < M; i++)
       {
           Mnum[i] = Integer.parseInt(st.nextToken());
           if (in_Nnum(Mnum[i]))
               System.out.println(1);
           else
               System.out.println(0);
       }
   }
   static boolean in_Nnum(int num)
   {
       for (int i = 0; i < N; i++)
           if (num == Nnum[i])
               return (true);
       return (false);
   }


// 풀이 - 2
// 메모리 초과로 실패

public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine());
       int[] num = new int[429496729];
       for (int i = 0; i < N; i++)
           num[Integer.parseInt(st.nextToken()) - 1]++;

       int M = Integer.parseInt(br.readLine());
       st = new StringTokenizer(br.readLine());
       for (int i = 0; i < M; i++) {
           if (num[Integer.parseInt(st.nextToken()) - 1] == 1)
               System.out.println(1);
           else
               System.out.println(0);
       }
       br.close();
   }
}

// 풀이 - 3
// 이분 탐색으로 성공 O(logn)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int []arr;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            if (bSearch(Integer.parseInt(st.nextToken())) >= 0)
                sb.append(1 + "\n");
            else
                sb.append(0 + "\n");
        }
        br.close();
        System.out.println(sb);
    }

    static int bSearch(int key)
    {
        int start = 0;
        int end = N - 1;

        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (key < arr[mid])
                end = mid - 1;
            else if (key > arr[mid])
                start = mid + 1;
            else
                return (mid);
        }
        return (-1);
    }
}
