import java.util.Scanner;

class cold {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp < 0)
                ans++;
        }
        System.out.println(ans);
    }
}