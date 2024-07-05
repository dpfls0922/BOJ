import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        float []score = new float[N];

        float max = 0;
        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
        {
            score[i] = Integer.parseInt(str.nextToken());
            if (score[i] > max)
                max = score[i];
        }
        float sum = 0;
        for (int i = 0; i < N; i++)
        {
            score[i] = score[i] / max * 100;
            sum += score[i];
        }
        System.out.println(sum / N);
        br.close();

    }
}
