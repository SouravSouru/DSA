package kunal_kushwaha_YT.linear_search;

public class FindMaxValueIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 22, 33, 43, 22 },
                { 77, 54, 77, 23, 45, 78 },
                { 1, 33, 65, 90 },
                { 3 }
        };

        int result = maxValue(arr);

        System.out.print("Max value is " + result);

    }

    static int maxValue(int[][] arr) {

        int maxValue = Integer.MIN_VALUE;

        if (arr.length == 0) {

            return Integer.MIN_VALUE;
        }

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (maxValue < arr[row][col]) {

                    maxValue = arr[row][col];

                }

            }

        }

        return maxValue;

    }

}
