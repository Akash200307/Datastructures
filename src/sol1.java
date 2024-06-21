import java.util.*;
import java.lang.*;
import java.io.*;
public class sol1 { /* package codechef; // don't place package name! */


    /* Name of the class has to be "Main" only if the class is public. */

    public static void main(String[] args) throws java.lang.Exception {

        {
            Scanner n1 = new Scanner(System.in);
            int t = n1.nextInt();
            n1.nextLine();
            for (int i = 0; i < t; i++) {
                String x = n1.nextLine();
                String y = n1.nextLine();
                StringBuilder s1 = new StringBuilder(" ");
                for (int j = 0; j < 5; j++) {
                    if (x.charAt(j) == y.charAt(j)) {
                        s1.append("G");
                    } else {
                        s1.append("B");
                    }
                }
                System.out.println(s1);
            }
        }
    }
}



