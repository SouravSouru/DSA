package kunal_kushwaha_YT.linear_search;

public class FindMin {

    public static void main(String[] args) {

        int[] arr = { 33, 44, 1, 22, 5 };

        System.out.println(findMin(arr));

    }

    static int findMin(int[] array) {
        int temp = Integer.MAX_VALUE;

        if (array.length == 0) {

            return Integer.MAX_VALUE;
        }

        for (int element : array) {

            if (element < temp) {

                temp = element;

            }

        }

        return temp;

    }

}
