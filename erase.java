import java.util.*;

public class erase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        if (n % 2 == 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (s1.equals(s2))
                System.out.println("Deletion succeeded");
            else
                System.out.println("Deletion failed");
        } else {
            char[] s1 = sc.nextLine().toCharArray();
            char[] s2 = sc.nextLine().toCharArray();
            if (s1.length != s2.length) {
                System.out.println("Deletion failed");
            } else {
                boolean same = true;
                for (int i = 0; i < s1.length; i++) {
                    if (s1[i] == s2[i])
                        same = false;
                }
                if (same)
                    System.out.println("Deletion succeeded");
                else
                    System.out.println("Deletion failed");
            }
        }
    }
}
