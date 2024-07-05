import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int []d = new int [N - 1];
        int []c = new int [N];
  
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++)
        	d[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
        	c[i] = Integer.parseInt(st.nextToken());
 
        long sum = 0;
        long min = c[0];
        for (int i = 0; i < N - 1; i++) {
        	if (c[i] < min)
        		min = c[i];
        	sum += d[i] * min;
        }
        System.out.println(sum);
    }
}
