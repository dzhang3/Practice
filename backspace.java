import java.util.*;

public class backspace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] line = sc.nextLine().toCharArray();
        int count = 0;
        for (int i = line.length - 1; i >= 0; i--) {
            if (line[i] == '<') {
                line[i] = ' ';
                count++;
            } else if (count > 0) {
                line[i] = ' ';
                count--;
            }
        }
        String ans = new String(line);
        System.out.println(ans.replace(" ", ""));
    }
}
