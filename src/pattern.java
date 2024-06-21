public class pattern {
    public void allsame(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        int num = 2 * n - 1;
        int row = 0;
        int col = 0;
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num; j++) {
                if (i == row || j == col || i == num - 2 || j == n - 1) System.out.print(n);
                if(i==row+1||j==col+1||i==(num-2)+1||j==(n-1)-1) System.out.print(n--);
            }
            row++;
            col++;

            n--;


            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern n1 = new pattern();
        n1.pattern2(6);
    }
}

