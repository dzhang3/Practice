import java.util.*;

public class OddManOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            HashMap<Integer, Boolean> coupled = new HashMap<>();
            for (int j = 0; j < m; j++) {
                int id = sc.nextInt();
                if (!coupled.keySet().contains(id)) {
                    coupled.put(id, false);
                } else {
                    coupled.put(id, true);
                }
            }
            for (Integer id : coupled.keySet()) {
                if (coupled.get(id) == false) {
                    System.out.println("Case #" + i + ": " + id);
                    break;
                }
            }
        }
    }
}
