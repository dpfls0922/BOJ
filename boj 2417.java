import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;


// 1 - 조건문
public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       long n = Long.parseLong(br.readLine());
       long root = (long)Math.sqrt(n);

       if(root * root < n) root++;
       System.out.println(root);
   }
}

// 2 - 이분 탐색
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        System.out.println(bSearch(n));
    }

    public static long bSearch(long n)
    {
        long start = 0;
        long end = n;
        long tmp = 0;

        while (start <= end)
        {
            long mid = (start + end) / 2;
            if ((long)Math.pow(mid, 2) >= n)
            {
                tmp = mid;
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return (tmp);
    }
}
