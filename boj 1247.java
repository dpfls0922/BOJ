// scanner 사용했을 때 메모리 : 310232KB, 시간: 1816ms
import java.util.Scanner;
import java.math.BigInteger;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            int N = sc.nextInt();
            BigInteger sum = new BigInteger("0");

            for (int j = 0; j < N; j++)
                sum = sum.add(sc.nextBigInteger());

            if (sum.compareTo(BigInteger.ZERO) == 1)
                System.out.println("+");
            else if (sum.compareTo(BigInteger.ZERO) == -1)
                System.out.println("-");
            else
                System.out.println(0);
        }
        sc.close();
    }
}

// bufferreader 사용했을 때 메모리 : 119656KB, 시간: 760ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
 public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++)
        {
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");

            for (int j = 0; j < N; j++)
            {
                BigInteger n = new BigInteger(br.readLine());
                sum = sum.add(n);
            }

            //compareTo(0)이 -1이면 음수, 1이면 양수, 0이면 0
            if (sum.compareTo(BigInteger.ZERO) == 1)
                System.out.println("+");
            else if (sum.compareTo(BigInteger.ZERO) == -1)
                System.out.println("-");
            else
                System.out.println(0);
        }
    }
}
