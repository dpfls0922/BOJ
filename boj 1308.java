import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

     static int is_Leap(int year)
     {
         if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
             return (1);
         return (0);
     }

     static int []date = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
     static int  countDays(int year, int month, int day)
     {
         int    days = 0;

         for (int i = 1; i < year; i++)
             days += 365 + is_Leap(i);
         for (int i = 0; i < month - 1; i++)
         {
             days += date[i];
             if (i == 1)
                 days += is_Leap(year);
         }
         days += day;
        return (days);
     }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str1 = new StringTokenizer(br.readLine());
        StringTokenizer str2 = new StringTokenizer(br.readLine());

        int y1 = Integer.parseInt(str1.nextToken());
        int m1 = Integer.parseInt(str1.nextToken());
        int d1 = Integer.parseInt(str1.nextToken());
        int y2 = Integer.parseInt(str2.nextToken());
        int m2 = Integer.parseInt(str2.nextToken());
        int d2 = Integer.parseInt(str2.nextToken());

        if ((y2 - y1 > 1000) || (y2 - y1 == 1000 && m2 > m1) || (y2 - y1 == 1000 && m2 == m1 && d2 >= d1))
            System.out.println("gg");
        else
            System.out.println("D-" + (countDays(y2, m2, d2) - countDays(y1, m1, d1)));
    }
}
