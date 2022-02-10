import java.util.*;

public class SodaSluper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();
        int sum = (e + f) / c;
        int n = sum / c;
        int remain = sum - (n * c) + n;
        while (remain >= c) {
            // System.out.println(sum + " " + remain + " " + n);
            sum += n;
            n = remain / c;
            remain = remain - n * c + n;
        }

        System.out.println(sum + remain);
    }
}
