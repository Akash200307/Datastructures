import java.util.*;

public class dsa {
    static int evenlyDivides(int N) {
        int temp = N;
        int count = 0;
        if (temp == 0) return 0;
        while (temp != 0) {

            if (temp % 10 != 0 && N % (temp % 10) == 0) {
                count++;
            }
            temp = temp / 10;

        }
        return count;
    }

    static int reverse_num(int N) {
        int temp = N;
        int reverse = 0;
        while (temp != 0) {
            reverse = (reverse * 10) + temp % 10;
            temp = temp / 10;
        }
        return reverse;
    }

    static int gcd(int a, int b) {
        int gcd1 = 1;
        for (int i = 1; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd1 = i;
            }

        }
        return gcd1;
    }

    static boolean armstrong(int a) {
        int original = a;
        int temp = a;
        int sum = 0;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        while (a != 0) {
            temp = a % 10;
            sum += Math.pow(temp, count);
            a /= 10;
        }
        return sum == original;
    }

    static int alldivisors(int a) {
        int result = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                result = (result * 10) + i;
            }
        }
        return result;
    }

    static int calculateSquare(int num) {
        int result = 0;
        int n = Math.abs(num);
        for (int i = 0; i < n; i++) {
            result += n;
        }
        return result;
    }

    static void recursion(int i, int n) {
        if (i > n) return;
        System.out.println("akaza");
        recursion(i + 1, n);
    }

    static void recursion3(int i, int n) {
        if (i < n) return;
        System.out.println(i);
        recursion3(i - 1, n);
    }

    static void recursion4(int i, int n) {//parameterized sum of natural numbers
        if (i < n) {
            System.out.println(n);
            return;
        }
        recursion4(i - 1, n + i);
    }

    static void r_faactorial(int i, int n) {
        if (i <= 1) {
            System.out.println(n);
            return;
        }
        r_faactorial(i - 1, n * i);

    }

    //sorting techniques
    static void selection_sort(int n, int[] a) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }


        }
        System.out.println("selection sort");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");

        }
    }

    static void bubble_sort(int n, int[] a) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }

    static void insertion_sort(int n, int[] a) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && a[j - 1] > a[j]) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
                j--;

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    static class merge_sort {
        private static void merge(int[] arr, int low, int mid, int high) {
            ArrayList<Integer> temp = new ArrayList<>();
            int left = low;
            int right = mid + 1;
            while (left <= mid && right <= high) {
                if (arr[left] < arr[right]) {
                    temp.add(arr[left]);
                    left++;

                } else {
                    temp.add(arr[right]);
                    right++;
                }
            }
            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }
            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }
            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }
        }

        public static void mergesort(int[] arr, int low, int high) {
            if (low == high) return;
            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);

        }

    }

    static class QuickSort {
        static int quick(int[] arr, int low, int high) {
            int pivot = low;
            int i = low + 1;
            int j = high;
            while (i < j) {
                while (arr[i] <= arr[pivot] && i < high) {
                    i++;
                }
                while (arr[j] > arr[pivot] && j > low) {
                    j--;
                }
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            int temp = arr[j];
            arr[j] = arr[pivot];
            arr[pivot] = temp;
            return j;
        }

        static void quick_sort(int[] arr, int low, int high) {
            if (low < high) {
                int part = quick(arr, low, high);
                quick_sort(arr, low, part - 1);
                quick_sort(arr, part + 1, high);
            }
            return;
        }
    }


    static class recursive {

        static void bubble(int[] arr, int n) {
            if (n == 1) return;
            for (int i = 0; i < n - 1; i++) {


                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
            bubble(arr, n - 1);
        }
    }

    static class recursive_ins {
        static void insertion(int[] arr, int i, int n) {


            for (i = 0; i < n; i++) {
                int j = i;
                while (j > 0 && arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                }
            }
            if (i == n) return;
            insertion(arr, i + 1, n);
        }
    }


    //solving problems on array
    //EASY
    static int max(int[] arr, int n) {
        int max = 0;
        max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //second-smallest integer
    static int smallest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                second = small;
                small = arr[i];
            } else if (arr[i] < second && arr[i] != small) {
                second = arr[i];
            }
        }
        return second;
    }

    //array is sorted
    static boolean is_sorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }

        }
        return true;
    }

    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    //rotate left by one variable
    static void left_array(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        for (int i : arr) {
            System.out.println(i);
        }
    }

    ///ratate array by two places
    static void d_place(int[] arr, int n, int k) {
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }

    }
//repeats 1 and twice
    public static int repeats(int[] a,int n) {
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ a[i];

        }
        return xorr;
    }

    public static int missingNumber(int[] a, int n) {

        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < n - 1; i++) {
            x1 = x1 ^ a[i];
            x2 = x2 ^ i + 1;
        }
        x2 = x2 ^ n;

        return x1 ^ x2;
    }
    public static int Klargest(int[] a, int k) {
        // Write your code here
        int n=a.length;
       int len=0;
        for (int i = 0; i <n ; i++) {
            long s=0;
            for (int j = i; j <n ; j++) {
               s+=a[j];



                if(s==k) len =Math.max(len,j-i+1);
            }

        }
        return len;


    }
public static int twosumhash(int []a,int k){
        Map<Integer,Integer> sol=new HashMap<>();
        int n=a.length;
    for (int i = 0; i <n ; i++) {
        int sum=k-a[i];
        if(sol.containsKey(sum))
            return 1;
        sol.put(a[i],sum);
    }
    return -1;
}
public static int twosumpointer(int[]a ,int k){
        int n=a.length;
        Arrays.sort(a);
        int left=0;
        int right=n-1;
        while(left<=right){
            int sum=a[left]+a[right];
            if(sum<k) left++;
            if(sum>k) right--;
            if(sum==k) return 1;
        }
        return -1;

}
public static int[] numberofzeroes(int[] arr,int n) {
    int low = 0;
    int mid = 0;
    int high = n - 1;
    while (mid<=high){
        if (arr[mid] == 0) {
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++;

        } else if (arr[mid] == 1) {
            mid++;
        } else  {
            int temp = arr[high];
            arr[high] = arr[mid];
            arr[mid] = arr[high];
            high--;
        }
    }

    return arr;
}
public static int accurate(int[] a,int n){
        int count=0;
    for (int i = 0; i <n ; i++) {

    }
    return count;
}
    public static void main(String[] args) {
        int[] arr = {1,0,2,1};
        int n=arr.length;
        System.out.println(Arrays.toString(numberofzeroes(arr, n)));

    }
}












        





