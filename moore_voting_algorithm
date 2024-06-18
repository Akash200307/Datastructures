public class mooreVotingALgorithm {
    public mooreVotingALgorithm() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 1, 1, 1, 2, 2};
        int result = MajorityElement(arr);
        System.out.println("The majority element is " + result);
    }

    static int MajorityElement(int[] arr) {
        int n = arr.length;
        int count = 0;
        int element = 0;

        int temp;
        for(temp = 0; temp < n; ++temp) {
            if (count == 0) {
                count = 1;
                element = arr[temp];
            } else if (arr[temp] == element) {
                ++count;
            } else {
                --count;
            }
        }

        temp = 0;

        for(int i = 0; i < n; ++i) {
            if (arr[i] == element) {
                ++temp;
            }
        }

        if (temp > n / 2) {
            return element;
        } else {
            return -1;
        }
    }
}
