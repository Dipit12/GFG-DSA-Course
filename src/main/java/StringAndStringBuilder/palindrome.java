package StringAndStringBuilder;

import java.util.Arrays;

public class palindrome {
    public static void main(String[] args) {
        String s = "abcdcbaa";
        char[] ch = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            ch[i] = s.charAt(i);
        }
        System.out.println(Arrays.toString(s.toCharArray()));

        System.out.println(isPalindrom(ch));
    }

    static boolean isPalindrom(char[] ch){
        int start =0;
        int end = ch.length - 1;

        while(start <= end){
            if(ch[start] != ch[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
