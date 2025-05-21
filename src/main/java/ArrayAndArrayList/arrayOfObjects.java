package ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class arrayOfObjects {
    public static void main(String[] args) {
        String[] str = new String[4];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < str.length; i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        try{
            str[0] = "hello";
            System.out.println(Arrays.toString(str));
        }catch(Exception error){
            System.out.println(error);
        }

    }
}
