// 방법 1 - 시간초과 (실패)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int []arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int max = 0;
        int maxCnt = 1;
        for (int i = 0; i < N - X + 1; i++) {
            int sum = 0;
            for (int j = i; j < X + i; j++)
                sum += arr[j];
            if (sum == max) maxCnt++;
            else if (sum > max) {
            	max = sum;
            	maxCnt = 1;
            }
        }
        if (max == 0) {
        	System.out.println("SAD");
        	return ;
        }
        System.out.println(max);
        System.out.println(maxCnt);
    }
}

// 방법 2 - 슬라이딩 윈도우 기법
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int []arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int i = 0; i < X; i++)
        	sum += arr[i];
        
        int max = sum;
        int maxCnt = 1;

        for (int i = X; i < N; i++) {
            sum -= arr[i - X];
            sum += arr[i];

            if (sum == max) maxCnt++;
            else if (sum > max) {
            	max = sum;
            	maxCnt = 1;
            }
        }
        if (max == 0) {
        	System.out.println("SAD");
        	return ;
        }
        System.out.println(max);
        System.out.println(maxCnt);
    }
}
