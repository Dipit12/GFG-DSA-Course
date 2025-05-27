package StringAndStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;

class Student{
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    void getAge(){
        System.out.println(this.age);
    }
    void getName(){
        System.out.println(this.name);
    }
}

public class intro {
    public static void main(String[] args) {
        String name = "Dipit Madan";
        String naam = "Dipit Madan";

        System.out.println(naam);
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.toLowerCase());

        int[] arr = {1,2,3,4,5};
        int[] b = arr;
        b[0] = 2;
        System.out.println(Arrays.toString(arr));
        System.out.println(name == naam);
        String names = new String("Dipit Madan");
        System.out.println(name == names); // compares if both ref variables point to the same object
        System.out.println(name.equals(names)); // only compares the value

        System.out.println(name.indexOf('M'));
        int a = 19;
        System.out.printf("My age is %d", a);

        Student s1 = new Student(19,"Dipit");
        s1.getAge();
        s1.getName();

        float sm = 343.232f;
        System.out.printf("Formatted value is %.2f",sm);
        System.out.printf("Hello my name is %s and my age is %d \n", "Dipit", 19);
        System.out.println('a' + 'b');
        System.out.println((char) ('a' + 3));
        System.out.println("Dipit" + new ArrayList<>());

        String series = "";
        for(int i = 0; i <  26; i++){
            char ch = (char) ('A' + i);
            System.out.print(ch + " ");
        }

    }
}
