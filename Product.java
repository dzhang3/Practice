import java.util.*;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTest = sc.nextInt();

        for (int i = 1; i <= nTest; i++) {
            int n = sc.nextInt();
            long[] v1 = new long[n];
            long[] v2 = new long[n];
            for (int j = 0; j < n; j++) {
                v1[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                v2[j] = sc.nextInt();
            }
            Arrays.sort(v1);
            Arrays.sort(v2);
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += v1[j] * v2[n - 1 - j];
            }
            System.out.println("Case #" + i + ": " + sum);
        }
    }

}
