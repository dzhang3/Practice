import java.util.*;

public class AlmostUnionFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<HashSet<Integer>> sets = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            HashSet<Integer> temp = new HashSet<>();
            temp.add(i);
            sets.add(temp);
            hash.put(i, i);
        }
        for (int i = 0; i < m; i++) {
            int com = sc.nextInt();
            if (com == 1) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int index1 = -1;
                int index2 = -1;
                boolean b1 = false;
                boolean b2 = false;
                for (int j = 0; j < sets.size(); j++) {
                    HashSet map = sets.get(j);
                    if (map.contains(n1)) {
                        index1 = j;
                        b1 = true;
                    }
                    if (map.contains(n2)) {
                        index2 = j;
                        b2 = true;
                    }
                    if (b1 && b2)
                        break;
                }
                if (index1 == index2)
                    continue;
                sets.get(index1).addAll(sets.get(index2));
                sets.remove(index2);
            } else if (com == 2) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int index1 = -1;
                int index2 = -1;
                boolean b1 = false;
                boolean b2 = false;
                for (int j = 0; j < sets.size(); j++) {
                    HashSet map = sets.get(j);
                    if (map.contains(n1)) {
                        index1 = j;
                        b1 = true;
                    }
                    if (map.contains(n2)) {
                        index2 = j;
                        b2 = true;
                    }
                    if (b1 && b2)
                        break;
                }
                if (index1 == index2)
                    continue;
                sets.get(index2).add(n1);
                sets.get(index1).remove(n1);
                if (sets.get(index2).isEmpty())
                    sets.remove(index2);

            } else if (com == 3) {
                int n1 = sc.nextInt();
                int index1 = -1;
                for (int j = 0; j < sets.size(); j++) {
                    HashSet map = sets.get(j);
                    if (map.contains(n1)) {
                        index1 = j;
                        break;
                    }
                }
                int sum = 0;
                for (Integer t : sets.get(index1)) {
                    sum += t;
                }
                System.out.println(sets.get(index1).size() + " " + sum);
            }
        }
    }
}
