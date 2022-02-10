import java.util.*;

public class ANewAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, String> maps = new HashMap<>();
        maps.put('a', "@");
        maps.put('b', "8");
        maps.put('c', "(");
        maps.put('d', "|)");
        maps.put('e', "3");
        maps.put('f', "#");
        maps.put('g', "6");
        maps.put('h', "[-]");
        maps.put('i', "|");
        maps.put('j', "_|");
        maps.put('k', "|<");
        maps.put('l', "1");
        maps.put('m', "[]\\/[]");
        maps.put('n', "[]\\[]");
        maps.put('o', "0");
        maps.put('p', "|D");
        maps.put('q', "(,)");
        maps.put('r', "|Z");
        maps.put('s', "$");
        maps.put('t', "\'][\'");
        maps.put('u', "|_|");
        maps.put('v', "\\/");
        maps.put('w', "\\/\\/");
        maps.put('x', "}{");
        maps.put('y', "`/");
        maps.put('z', "2");

        char[] line = sc.nextLine().toCharArray();
        for (char c : line) {
            if (Character.isAlphabetic(c)) {
                System.out.print(maps.get(Character.toLowerCase(c)));
            } else
                System.out.print(c);
        }
    }
}
