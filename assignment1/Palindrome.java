package assigment1;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("manam: " + isPalindrome("manam"));
        System.out.println("mannam:" + isPalindrome("mannam"));
        System.out.println("mint:  " + isPalindrome("mint"));
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        // using two points
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
