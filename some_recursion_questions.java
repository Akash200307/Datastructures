import java.util.ArrayList;

public class recursion {
    public static void main(String[] args) {
        System.out.println(count_zeroes(30077850,0));

    }
 static int prod_of_digits(int n){
        if (n==0){
            return 1;
     }
     return n%10*prod_of_digits(n/10);
 }
 static int sum_of_digits(int n){
        if (n==0){
            return 0;
     }
     return n%10+sum_of_digits(n/10);
 }
 static int reverse_a_number(int n,int res) {
     if (n==0) {
         return res;
     }
     res=res*10+n%10;
     return reverse_a_number(n/10,res);
 }
 static int count_zeroes(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
        }
        return count_zeroes(n/10,count);
 }

}
