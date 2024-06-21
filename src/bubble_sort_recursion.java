import java.util.Arrays;
import java.util.Collections;

public class bubble_sort_recursion {
    public static void main(String[] args) {
        int[] arr={4,1,3,2};
        selectionsort(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr,int r,int c){
       if(r==0){
           return;
       }
        if(r>c){
            if(arr[c]>arr[c+1]){
                //swap
                int temp =arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubblesort(arr,r,c+1);
            }
        else{
            bubblesort(arr,r-1,0);
        }
    } static void selectionsort(int[] arr,int r,int c,int max){
       if(r==0){
           return;
       }
        if(r>c){
            if(arr[c]>arr[max]) {
                selectionsort(arr, r, c + 1, c);
            }else {
                selectionsort(arr, r, c + 1, max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionsort(arr,r-1,0,0);
        }

    }
}
