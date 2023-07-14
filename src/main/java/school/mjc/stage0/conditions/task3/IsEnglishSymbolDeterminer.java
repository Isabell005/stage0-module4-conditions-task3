package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {

        if ((symbol >= 0041) || (symbol <= 005) && (symbol>=0061 || symbol<=007)) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
