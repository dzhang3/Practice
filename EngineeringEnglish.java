import java.util.*;

public class EngineeringEnglish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> appeared = new HashSet<>();
        while (sc.hasNextLine()) {
            for (String s : sc.nextLine().split(" "))
                if (appeared.contains(s.toLowerCase()))
                    System.out.print(". ");
                else {
                    System.out.print(s + " ");
                    appeared.add(s.toLowerCase());
                }
            System.out.println();
        }

    }
}
