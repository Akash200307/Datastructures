public class bs {
    public static void main(String[] args) {
        int arr[]={1,2,3,47,85,89};
        System.out.println(search( 47,arr,0,arr.length));
    }
    static  int search(int target,int[] arr,int st,int ed){
        int middle=st+(ed-st)/2;
        if(arr[middle]==target){
            return middle;
        }
        if(ed<st){
            return -1;
        }
        if(target>arr[middle]){
           return search(target,arr,middle+1, ed);
        }
        else
           return search(target,arr,middle+1, ed);
    }
}
