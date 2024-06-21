public class secondLargestElement {
    public static void main(String[] args) {
        int [] arr={1,2,4,7,7,5,3};
        int largest=arr[0];
        int sec_largest=-1;
        for (int i = 1; i <arr.length; i++) {
        if(arr[i]>largest){

            sec_largest=largest;
            largest=arr[i];

        }
        else if(arr[i]<largest&&arr[i]>sec_largest)
            sec_largest=arr[i];
        }
        System.out.println(sec_largest);
    }
}
