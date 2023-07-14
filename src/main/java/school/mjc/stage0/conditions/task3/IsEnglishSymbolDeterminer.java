package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {

        if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'y' || symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U' || symbol == 'Y' || symbol == 'q' || symbol == 'w' || symbol == 'r' || symbol == 't' || symbol == 'p' || symbol == 's' || symbol == 'd' || symbol == 'f' || symbol == 'g' || symbol == 'h' || symbol == 'j' || symbol == 'k' || symbol == 'l' || symbol == 'z' || symbol == 'x' || symbol == 'c' || symbol == 'v' || symbol == 'b' || symbol == 'n' || symbol == 'm' || symbol == 'Q' || symbol == 'W' || symbol == 'R' || symbol == 'T' || symbol == 'P' || symbol == 'S' || symbol == 'D' || symbol == 'F' || symbol == 'G' || symbol == 'H' || symbol == 'J' || symbol == 'K' || symbol == 'L' || symbol == 'Z' || symbol == 'X' || symbol == 'C' || symbol == 'V' || symbol == 'B' || symbol == 'N' || symbol == 'M') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
