import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static int []arr;
    static int N, total;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        total = Integer.parseInt(br.readLine());

        int left = 1;
        int right = total;
        int res = 0;
        if (isPossible(total)) {
        	System.out.println(Arrays.stream(arr).max().getAsInt());
        	return ;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (isPossible(mid)) {
                left = mid + 1;
                res = mid;
            }
            else right = mid - 1;
        }
        System.out.println(res);
    }
    static boolean isPossible(int res) {
        int sum = 0;
        for (int i =0; i < N; i++) {
            if (arr[i] > res)
                sum += res;
            else sum += arr[i];
        }
        if (sum > total) return false;
        return true;
    }
}
