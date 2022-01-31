import java.util.*;

public class pebbleSolitaire {

    private static int solve(char[] board) {
        int pebbles = 0;

        for (char c : board) {
            if (c == 'o')
                pebbles++;
        }

        char[] backup = Arrays.copyOf(board, board.length);

        for (int i = 0; i < board.length; i++) {
            if (board[i] == 'o') {
                if (i + 2 < board.length && board[i + 1] == 'o' && board[i + 2] == '-') {
                    board[i] = '-';
                    board[i + 1] = '-';
                    board[i + 2] = 'o';
                    pebbles = Math.min(pebbles, solve(board));
                    board = Arrays.copyOf(backup, board.length);
                }
                if (i - 2 >= 0 && board[i - 1] == 'o' && board[i - 2] == '-') {
                    board[i] = '-';
                    board[i - 1] = '-';
                    board[i - 2] = 'o';
                    pebbles = Math.min(pebbles, solve(board));
                    board = Arrays.copyOf(backup, board.length);
                }
            }
        }

        return pebbles;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            char[] board = sc.nextLine().toCharArray();
            System.out.println(solve(board));
        }
    }
}
