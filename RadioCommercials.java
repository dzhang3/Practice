import java.util.*;

public class RadioCommercials {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price = sc.nextInt();
        sc.nextLine();
        int[] breaks = new int[n];

        for (int i = 0; i < n; i++) {
            breaks[i] = sc.nextInt() - price;
        }

        int max = breaks[0];
        int local_max = breaks[0];

        for (int i = 1; i < n; i++) {
            local_max = Math.max(local_max + breaks[i], breaks[i]);
            if (local_max > max) {
                max = local_max;
            }
        }

        System.out.println(max);
    }

}
