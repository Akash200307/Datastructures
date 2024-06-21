public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        int spaces=1 ;
        int count=0;
        for (int i = 2*n-1; i >=0;--i) {
                int stars=i;

                if(i>=n){
                    stars=i-n;
                }
                else{
                    stars=n-i-1;
                }
                count++;

            for (int j = stars; j >=0 ; j--) {
                System.out.print("*");
            }
             for (int j = 1; j <spaces; j++) {
                System.out.print(" ");

            }
              for (int j = stars; j >=0 ; j--) {
                System.out.print("*");
            }


            System.out.println();
             if(count==5) continue;
             if(count>n) spaces-=2;
             else spaces+=2;
    }

}
        }
