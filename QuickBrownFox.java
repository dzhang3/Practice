import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] alph = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z" };
        for (int i = 0; i < n; i++) {
            boolean miss = false;
            String missing = "";
            String line = sc.nextLine().toLowerCase();
            for (String x : alph) {
                if (!line.contains(x)) {
                    miss = true;
                    missing += x;
                }
            }
            if (miss) {
                System.out.println("missing " + missing);
            } else {
                System.out.println("pangram");
            }
        }
    }
}
