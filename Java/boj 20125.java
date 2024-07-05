import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        char[][] board = new char[N + 5][N + 5];

        boolean head = false;
        int heart_x = 0, heart_y = 0;
        for (int i = 0; i < N; i++) {
        	String s = br.readLine();
        	for (int j = 0; j < N; j++) {
        		board[i][j] = s.charAt(j);
        		if (!head && s.charAt(j) == '*') {
        			heart_x = i + 1; 
        			heart_y = j;
        			head = true;
        		}
        	}
        }

        int left_arm = 0;
		for(int j = heart_y - 1; j >= 0; j--)
			if(board[heart_x][j] == '*')
				left_arm++;
		
		int right_arm = 0;
		for(int j = heart_y + 1; j < N; j++)
			if(board[heart_x][j] == '*')
				right_arm++;
		
		int waist = 0;
		int waist_x = 0, waist_y = heart_y;
		for(int i = heart_x + 1; i < N; i++) {
			if(board[i][heart_y] == '*') {
				waist++;
				waist_x = i; 
			}
		}
		
		int left_leg=0;
		for(int i = waist_x + 1; i < N; i++)
			if(board[i][heart_y - 1] == '*')
				left_leg++;
		
		int right_leg = 0;
		for(int i = waist_x + 1; i < N; i++)
			if(board[i][heart_y + 1] == '*')
				right_leg++;
        
    	System.out.println((heart_x + 1) + " " + (heart_y + 1));
    	System.out.println(left_arm + " " + right_arm + " " + waist + " " + left_leg + " " + right_leg);
    }
}
