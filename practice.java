import java.util.*;

public class practice {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        ArrayList<Integer> scores = new ArrayList<Integer>(2);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                scores.set(1, scores.get(1) + 1);
            } else if (a.get(i) > b.get(i)) {
                scores.set(0, scores.get(0) + 1);
            }
        }
        return scores;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);
        System.out.println(compareTriplets(a, b));
    }

}
