package kunal_kushwaha_YT.linear_search;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                { 22, 33, 43, 22 },
                { 77, 54, 77, 23, 45, 78 },
                { 1, 33, 65, 90 },
                { 3 }
        };

        int target = 3;
        int[] result = search(arr, target);

        System.out.print("Item found in row " + result[0] + " and column " + result[1]);

    }

    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target) {

                    return new int[] { row, col };

                }

            }

        }
        return new int[] { -1, -1 };

    }

}
