import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int []arr;
	static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr =new int[M];
        for (int i = 0; i < M; i++)
        	arr[i] = Integer.parseInt(st.nextToken());
        
        int left = 1;
        int right = N;
        int res = 0;
        
        while (left <= right) {
        	int mid = (left + right) / 2;
        	if (isPossible(mid)) {
        		right = mid - 1;
        		res = mid;
        	}
        	else left = mid + 1;
        }
        System.out.println(res);
    }
    static boolean isPossible(int height) {
    	int prev = 0;
    	
    	for (int i = 0; i < M; i++) {
    		if (arr[i] - height <= prev)
    			prev = arr[i] + height;
    		else
    			return false;
    	}
    	return N - prev <= 0;
    }
}
