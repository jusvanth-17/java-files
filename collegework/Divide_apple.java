import java.util.*;
public class Divide_apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, avg;
        n = sc.nextInt();
        long val = 0, sum = 0, ne;
        long b[] = new long[n];
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        avg = (int) (sum / (long) n);
 
        b[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            b[i + 1] = a[i] + b[i] - avg;
        }
        Arrays.sort(b);
 
        ne = -b[n / 2];
        for (int i = 0; i < n; i++)
            val = val + Math.abs(b[i] + ne);
        System.out.println(val);
    }
}
