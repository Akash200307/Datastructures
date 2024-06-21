import java.util.*;
public class large {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

       int[] arr1= new int[2];
       arr1[0] =s1.nextInt();
       arr1[1] =s1.nextInt();
       int n=arr1[0];
       int k=arr1[1];

        try {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s1.nextInt();
            }
            System.out.println(arr[k - 1]);
        } catch (Exception e) {
            System.out.println("-1");
        }
    }
}
