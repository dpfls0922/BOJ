// 방법 1. 스택 사용 -> [시간초과] 실패

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static Stack<String> log = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        int size = 0;
        if (game.equals("Y"))
            size = 2;
        else if (game.equals("F"))
            size = 3;
        else if (game.equals("O"))
            size = 4; 
        
        int cnt = 0;
      	int current = 0;
        for (int i = 0; i < N; i++) {
            String player = br.readLine();
            if (!log.contains(player)) {
                log.push(player);
                current++;
                if (current == size - 1) {
                    cnt++;
                    current = 0;
                }
            }
        }
        System.out.println(cnt);
    }
}

// 방법 2. 해시를 사용한 집합과 맵
// Set은 객체를 중복해서 저장할 수 없고 하나의 null 값만 저장할 수 있다. 또한 저장 순서가 유지되지 않는다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        int size = 0;
        if (game.equals("Y"))
            size = 2;
        else if (game.equals("F"))
            size = 3;
        else if (game.equals("O"))
            size = 4; 
        
        int cnt = 0;
      	int current = 0;
      	Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (!set.contains(name)) {
                set.add(name);
                current++;
                if (current == size - 1) {
                    cnt++;
                    current = 0;
                }
            }
        }
        System.out.println(cnt);
    }
}
