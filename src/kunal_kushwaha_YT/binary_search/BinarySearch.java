package kunal_kushwaha_YT.binary_search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arra = { 2, 44, 55, 65, 78 };
        int target = 2;

        System.out.println(binary_search(arra, target));

    }

    static int binary_search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int middleVlaue = start + (end - start) / 2;

            if (target < arr[middleVlaue]) {
                end = middleVlaue - 1;

            } else if (target > arr[middleVlaue]) {
                start = middleVlaue + 1;

            } else {
                return arr[middleVlaue];
            }

        }

        return -1;

    }

}
