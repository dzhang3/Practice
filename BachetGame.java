import java.util.*;

public class BachetGame {

    private static boolean solve(int[] moves, int n) {
        int[] poss = new int[n + 1];
        // poss[0] = 0;
        // poss[1] = 1;

        for (int i = 0; i <= n; i++) {
            boolean winnable = false;
            for (int j = 0; j < moves.length; j++) {
                if (moves[j] <= i) {
                    if (poss[i - moves[j]] != 1) {
                        winnable = true;
                    }
                }
            }
            if (winnable) {
                poss[i] = 1;
            } else {
                poss[i] = 0;
            }
        }

        // for (int i = 0; i < n; i++) {
        // System.out.print(poss[i] + " ");
        // }
        // System.out.println("moves");
        // for (int i = 0; i < moves.length; i++) {
        // System.out.print(moves[i] + " ");
        // }

        return poss[n] == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int stones = sc.nextInt();
            int m = sc.nextInt();
            int[] moves = new int[m];

            for (int i = 0; i < m; i++) {
                moves[i] = sc.nextInt();
            }

            if (solve(moves, stones)) {
                System.out.println("Stan wins");
            } else {
                System.out.println("Ollie wins");
            }
        }
    }
}
