package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y'||character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' || character == 'Y') {
            System.out.println("Vowel");
        } else if (character == 'q' || character == 'w' || character == 'r' || character == 't' || character == 'p' || character == 's'||character == 'd' || character == 'f' || character == 'g' || character == 'h' || character == 'j' || character == 'k'||character == 'l' || character == 'z' || character == 'x' || character == 'c' || character == 'v' || character == 'b'|| character == 'n' || character == 'm'||character == 'Q' || character == 'W' || character == 'R' || character == 'T' || character == 'P' || character == 'S'||character == 'D' || character == 'F' || character == 'G' || character == 'H' || character == 'J' || character == 'K'||character == 'L' || character == 'Z' || character == 'X' || character == 'C' || character == 'V' || character == 'B'|| character == 'N' || character == 'M') {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
