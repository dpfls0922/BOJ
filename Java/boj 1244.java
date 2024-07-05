import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int []arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int P = Integer.parseInt(br.readLine());
        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            switch (gender) {
                case 1:
                	for (int j = 0; j < N; j++)
                        if ((j + 1) % num == 0) arr[j] = arr[j] == 1 ? 0 : 1;
                    break;
                case 2:
                	arr[num - 1] = arr[num - 1] == 1 ? 0 : 1;
                	
                	int j = 1;
                	while ((num - 1 - j) >= 0 && (num - 1 + j) < arr.length) {
                		if (arr[num - 1 + j] == arr[num - 1 - j]) {
                			arr[num - 1 - j] = arr[num - 1 - j] == 1 ? 0 : 1;
                            arr[num - 1 + j] = arr[num - 1 + j] == 1 ? 0 : 1;
                		}
                		else break;
                		j++;
                	}
                    break;
            }
        }
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
            if(i % 20 == 19) sb.append("\n");
        }
        System.out.println(sb);
    }
}
