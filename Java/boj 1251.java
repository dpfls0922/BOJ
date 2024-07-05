import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

// 풀이 - 1 (compareTo 사용)
// 메모리 14208KB 시간 128ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        StringBuilder ascend = new StringBuilder("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

        String str = br.readLine();
        int len = str.length();
        for (int i = 0; i < len - 1; i++)
        {
            for (int j = i + 1; j < len - 1; j++)
            {
                tmp.append(str.substring(0, i + 1)).reverse();
                sb.append(tmp);
                tmp.setLength(0);
                tmp.append(str.substring(i + 1, j + 1)).reverse();
                sb.append(tmp);
                tmp.setLength(0);
                tmp.append(str.substring(j + 1)).reverse();
                sb.append(tmp);
                tmp.setLength(0);

                if (sb.compareTo(ascend) < 0)
                {
                  // ascend = sb; 를 하면 문자열의 복사가 아닌, ascend가 아예 sb의 주소값을 가리키게 됨
                    ascend.setLength(0);
                    ascend.append(sb);
                }
                sb.setLength(0);
            }
        }
        System.out.println(ascend);
    }
}

// 풀이 - 2  (list 정렬 사용)
// 메모리 20048KB 시간 224ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i < len - 1; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                String res = new String();
                res += reverse(0, i, str);
                res += reverse(i, j, str);
                res += reverse(j, len, str);
                list.add(res);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
    static String reverse(int start, int end, String str)
    {
        String s = new String();
        for (int i = end - 1; i >= start; i--)
            s += str.charAt(i);
        return (s);
    }
}
