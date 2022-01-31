import java.util.*;

public class DataStructureGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<Integer> data = new ArrayList<>();
            boolean stack = true;
            boolean queue = true;
            boolean pqueue = true;

            for (int i = 0; i < n; i++) {
                int com = sc.nextInt();
                int j = sc.nextInt();

                if (com == 1) {
                    data.add(j);
                } else if (com == 2) {
                    int index = data.indexOf(j);
                    if (data.size() == 0) {
                        stack = false;
                        queue = false;
                        pqueue = false;
                        continue;
                    }
                    if (index != 0) {
                        queue = false;
                    }
                    if (index != data.size() - 1) {
                        stack = false;
                    }
                    if (j != Collections.max(data)) {
                        pqueue = false;
                    }
                    if (index != -1) {
                        data.remove(index);
                    }

                }
            }
            if ((stack ? 1 : 0) + (queue ? 1 : 0) + (pqueue ? 1 : 0) > 1) {
                System.out.println("not sure");
            } else if (stack) {
                System.out.println("stack");
            } else if (queue) {
                System.out.println("queue");
            } else if (pqueue) {
                System.out.println("priority queue");
            } else {
                System.out.println("impossible");
            }
        }

    }
}
