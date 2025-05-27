package RecursionIntro;

public class numbers {
    // write a function that takes in a number and prints it
    // print first 5 numbers: 1 2 3 4 5
    public static void main(String[] args) {

        print(1);
    }

    static void print(int n){
       if(n == 5){
           System.out.println(n);
           return;
       }
        System.out.println(n);
       print(n+1);
    }
}
