
package kunal_kushwaha_YT.linear_search;

public class FIndTargetItem {

    public static void main(String[] args) {
        int[] arr = { 12, 334, 3, 55, 34 };
        int targetItem = 3;

        System.out.println(findItems(arr, targetItem));

    }

    static int findItems(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i : arr) {
            if (i == target) {
                return i;
            }
        }
        return -1;

    }

}
