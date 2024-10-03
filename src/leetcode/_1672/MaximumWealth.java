package leetcode._1672;

public class MaximumWealth {

    public static void main(String[] args) {

        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };

        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] array) {
        int totalAccount = Integer.MIN_VALUE;
        for (int person = 0; person < array.length; person++) {

            int sum = 0;

            for (int account = 0; account < array[person].length; account++) {

                sum += array[person][account];

            }

            if (sum > totalAccount) {
                totalAccount = sum;

            }

        }

        return totalAccount;

    }

}
