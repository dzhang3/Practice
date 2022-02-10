import java.util.*;

public class BirdsOnAWire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int dist = sc.nextInt();
        int n = sc.nextInt();
        if (n == 0) {
            int total = 0;
            int pos = 6;
            while (pos <= length - 6) {
                total++;
                pos += dist;
            }
            System.out.println(total);
        } else {
            ArrayList<Integer> birds = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                birds.add(sc.nextInt());
            }
            Collections.sort(birds);
            int total = (birds.get(0) - 6) / dist;
            for (int i = 0; i < n; i++) {
                int pos = birds.get(i) + dist;
                if (i != n - 1) {
                    while (pos <= birds.get(i + 1) - dist) {
                        pos = pos + dist;
                        total++;
                    }
                } else {
                    while (pos <= length - 6) {
                        pos = pos + dist;
                        total++;
                    }
                }
            }
            System.out.println(total);
        }
    }
}
