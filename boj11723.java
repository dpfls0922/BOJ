import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = null;
			StringBuilder sb = new StringBuilder();
			int tc = Integer.parseInt(br.readLine());
			int	S = 0;
			
			for (int i = 0; i < tc; i++){
				st = new StringTokenizer(br.readLine());
				String str = st.nextToken();
				int n = 0;
				switch (str){
					case "add":
						n = Integer.parseInt(st.nextToken()) - 1;
						S = S | (1 << n);
						break;
					case "remove":
					n = Integer.parseInt(st.nextToken()) - 1;
						S = S & ~(1 << n);
						break;
					case "check":
						n = Integer.parseInt(st.nextToken()) - 1;
						if((S & (1 << n)) > 0)
							sb.append("1\n");
						else
							sb.append("0\n");
						break;
					case "toggle":
						n = Integer.parseInt(st.nextToken()) - 1;
						S = S ^ (1 << n);
						break;
					case "all":
						S = -1;
						break;
					case "empty":
						S = 0;
						break;
				}
			}
			System.out.println(sb.toString());
		}
	}
