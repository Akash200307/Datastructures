public class large_1 {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,8,90,78,78};
        int result=larger(arr);
        int result1=sec_smallest(arr);
        System.out.println(result);
        System.out.println(result1);
    }
    public static int larger(int[] arr){
        int large =Integer.MIN_VALUE;
        int sec_large=Integer.MIN_VALUE;
        int n =arr.length;
        if(n>2)
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                sec_large=large;
                large=arr[i];
            }
            else if(arr[i]>sec_large&&arr[i]!=large){
                    sec_large=arr[i];
            }
        }
        return sec_large;
    }
    public static int sec_smallest(int[] arr) {
        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;
        int n = arr.length;
        if (n > 2) {
            for (int i = 0; i < n; i++) {
                if (arr[i] < small) {
                    sec_small = small;
                    small = arr[i];
                } else if (arr[i] < sec_small && arr[i] != small) {
                        sec_small=arr[i];

                }
            }
        }
        return sec_small;
    }
}
