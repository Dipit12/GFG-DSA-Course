package LinearSearch;

import java.util.Arrays;

public class searchingInString {
    public static void main(String[] args) {
       String s  = "Dipit";
       char target = 't';
        System.out.println(search(s,target));
    }

    static boolean search(String s, char target){

        if(s.length() == 0){
            return false;

        }
        char[] stringArr = s.toCharArray();
        System.out.println(Arrays.toString(stringArr));

        for(int i = 0; i < stringArr.length; i++){
            if(stringArr[i] == target){
                return true;
            }
        }
        return false;
    }
}
