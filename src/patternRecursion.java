public class patternRecursion {
    public static void main(String[] args) {
        pattern1(6, 0);
    }

    static void pattern1(int row, int column) {
        if (row == 0) {
            return;
        }
        if (column < row) {

            pattern1(row, column + 1);
            System.out.print("*");
        } else {

            pattern1(row - 1, 0);
            System.out.println();
        }
    }

}
