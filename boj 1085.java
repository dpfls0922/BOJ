import java.util.Scanner;
import java.lang.Math;

 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        sc.close();

        int w_distance = Math.min(w - x, x - 0);
        int h_distance = Math.min(h - y, y - 0);
        System.out.println(Math.min(w_distance, h_distance));
    }
}
