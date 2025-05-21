package Recursion;

public class functionBasic {
    public static void func1(){
        System.out.println("function 1");
    }
    public static void func2(){
        System.out.println("before function-2");
        func1();
        System.out.println("after function-2");
    }
    public static void main(String[] args){
        System.out.println("before func2");
        func2();
        System.out.println("after func2");
        func1();
    }
}
