package kunal_kushwaha_YT.linear_search;

public class SearchString {

    public static void main(String[] args) {
        String str   = "Sourav";
        char target = 'a';

        System.out.println(search(str, target));

    }

    static boolean search(String str, char target) {

        if (str.length() == 0) {
            return false;

        }

        for (char element : str.toCharArray()) {

            if (element == target) {

                return true;

            }

        }
        return false;

    }

}
