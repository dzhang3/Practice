import java.util.Scanner;

class Oddities {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a % 2 == 0)
                System.out.println(a + " is even");
            else
                System.out.println(a + " is odd");
        }
        sc.close();
    }
}