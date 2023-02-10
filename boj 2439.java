import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = n - i; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

// System.out.print()를 자주 호출해서 늘어난 시간을 줄이는 방법 -> StringBuilder
// 모든 문자열을 하나의 객체에 연결해준다음 출력은 마지막에 한 번만 해준다.
// 292ms -> 128ms
  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
                sb.append(" ");
            for (int j = n - i; j < n; j++)
                sb.append("*");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
