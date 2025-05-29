package Recursion;

public class palindrome {
    public static void main(String[] args) {
        String a = "abcdcba";
        System.out.println(palindrome(a,0,a.length()-1));
    }

    static boolean palindrome(String n, int start, int end) {
        // Base case: if start >= end, it means we've checked all character pairs
        if (start >= end) {
            return true;
        }

        // If characters at current pointers don't match, it's not a palindrome
        if (n.charAt(start) != n.charAt(end)) {
            return false;
        }

        // Move inward and check the next pair
        return palindrome(n, start + 1, end - 1);
    }

}
