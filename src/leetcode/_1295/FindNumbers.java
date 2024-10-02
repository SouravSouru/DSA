package leetcode._1295;

public class FindNumbers {

    public static void main(String[] args) {

        int[] nums = { 12, 345, 2, 6, 7896 };

        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] numbers) {

        int count = 0;

        for (int numb : numbers) {

            if (even(digit(numb))) {

                count++;

            }

        }

        return count;

    }

    static boolean even(int num) {

        return num % 2 == 0;

    }

    // to get the number of digit in a number
    static int digit(int num) {

        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            num = num * -1;
        }

        int count = 0;

        while (num > 0) {

            count++;
            num = num / 10;

        }

        return count;

    }
}
