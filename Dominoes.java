import java.util.*;

public class Dominoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int tiles = sc.nextInt();
            int nMappings = sc.nextInt();
            int knocked = sc.nextInt();
            HashMap<Integer, Integer> knock = new HashMap<>(tiles);
            boolean[] visited = new boolean[tiles];
            for (int j = 0; j < nMappings; j++) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                knock.put(n1, n2);
            }
            int total = 0;
            for (int j = 0; j < knocked; j++) {
                total++;
                int dom = sc.nextInt();
                while (!visited[dom - 1] && knock.containsKey(dom)) {
                    dom = knock.get(dom);
                    total++;
                }
            }
            System.out.println(total);
        }
    }

}
