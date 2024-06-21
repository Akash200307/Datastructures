import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

public class recursion_array {
    public static void main(String[] args) {

       // System.out.println(issorted(new int[]{1,2,3,5,4},0));
        //System.out.println(Linearsearch(new int[] {12,43,23,23,6,72},23,0));
       linearsearch_multiple(new int[] {12,43,23,23,6,72},2,0);
        System.out.println(list);
    }
    static boolean issorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }

            return arr[i]<arr[i+1]&& issorted(arr,i+1);


    }
    static int Linearsearch(int[] arr,int target,int i){
        if(arr[i]==target){
            return i+1;
        }
        if(i== arr.length-1){
            return -1;
        }

            return Linearsearch(arr, target, i + 1);

    }
static ArrayList<Integer>list=new ArrayList<>();
static void linearsearch_multiple(int[] arr,int target,int i){
        if(arr[i]==target){
            list.add(i+1);
        }
        if(i== arr.length-1){
            return;
        }
        linearsearch_multiple(arr,target,i+1);
}
}
