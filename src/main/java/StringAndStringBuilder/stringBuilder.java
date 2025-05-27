package StringAndStringBuilder;

import java.util.Arrays;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        StringBuilder builder1 = new StringBuilder("Dipit");
        System.out.println(builder1.length());
        System.out.println(builder1.charAt(4));
        String name = "Dipit";
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
