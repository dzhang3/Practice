import java.io.*;
import java.util.*;

class d2 {
    public Comparator<Integer> intComparator = new Comparator<Integer>() {
        public int compare(Integer i1, Integer i2) {
            return i2 - i1;
        }
    };

    public void process() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (sc.hasNext()) {
            int numOperations = sc.nextInt();
            Deque<Integer> stack = new ArrayDeque<>(); // last in, first out
            Queue<Integer> queue = new ArrayDeque<>(); // first in, first out
            Queue<Integer> priorityQueue = new PriorityQueue<>(16, intComparator); // take larger elements first

            boolean matchStack = true;
            boolean matchQueue = true;
            boolean matchPriorityQueue = true;
            for (int i = 0; i < numOperations; i++) {
                int op = sc.nextInt();
                int x = sc.nextInt();
                if (op == 1) { // insert x
                    stack.addLast(x);
                    queue.add(x);
                    priorityQueue.add(x);
                } else { // op == 2 -> query x
                    if (stack.isEmpty()) { // there is not any element in any of the structures
                        matchStack = false;
                        matchQueue = false;
                        matchPriorityQueue = false;
                        continue;
                    }
                    int stackOutput = stack.pollLast();
                    int queueOutput = queue.poll();
                    int priorityQueueOutput = priorityQueue.poll();
                    if (stackOutput != x) {
                        matchStack = false;
                    }
                    if (queueOutput != x) {
                        matchQueue = false;
                    }
                    if (priorityQueueOutput != x) {
                        matchPriorityQueue = false;
                    }
                }
            }

            String answer = "";
            int qty = (matchStack ? 1 : 0) + (matchQueue ? 1 : 0) + (matchPriorityQueue ? 1 : 0);
            if (qty > 1) {
                answer = "not sure"; // it can be more than one of the three data structures
            } else if (matchStack) {
                answer = "stack";
            } else if (matchQueue) {
                answer = "queue";
            } else if (matchPriorityQueue) {
                answer = "priority queue";
            } else {
                answer = "impossible"; // it cannot be any of the three data structures
            }

            System.out.println(answer);
        }

        bw.flush();
        bw.close();

        return;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        d2 m = new d2();
        m.process();

        System.exit(0);
    }
}