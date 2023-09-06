package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public static void main(String[] args) {
        AliquotNumbers aliquotNumbers = new AliquotNumbers();
        aliquotNumbers.isFirstAliquot(2, 6); // Example usage
    }

    public void isFirstAliquot(int first, int second) {
        if (first != second && second % first == 0) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}