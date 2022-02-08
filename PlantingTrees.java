import java.util.*;

public class PlantingTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }

        Arrays.sort(times);
        // System.out.println(Arrays.toString(times));
        for (int i = n - 1; i >= 0; i--) {
            times[i] += (n - i);
        }

        int max = 0;
        for (int i : times) {
            if (i > max)
                max = i;
        }
        System.out.println(max + 1);
    }
}
