public class rem_duplicate {
    public static void main(String[] args) {
        int[]  arr={1,2,4,5,5,9,63,54};
        int i=0;
        for (int j = 1; j <arr.length ; j++) {
            if(arr[j]!=arr[i]){
                    i++;
                    arr[i]=arr[j];
            }
        }
        for (int j = 0; j <i+1 ; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
