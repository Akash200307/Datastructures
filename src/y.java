public class y {
    public static void main(String[] args) {
        int n=12;
        int store=n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j&&i<n/2||j==store-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            store--;

            System.out.println();

        }
    }
}
