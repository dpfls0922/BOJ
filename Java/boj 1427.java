import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char []str = br.readLine().toCharArray();
        Arrays.sort(str);
        for (int i = str.length - 1; i >= 0; i--)
            System.out.print(str[i]);
    }
}
