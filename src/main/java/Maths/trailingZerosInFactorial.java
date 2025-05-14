package Maths;

public class trailingZerosInFactorial {
    // naive  method
    class Solution {
        public int trailingZeroes(int n) {
            // first calculate the factorial
            if(n == 0 || n == 1){
                return 0;
            }
            int fact = 1;
            while(n >= 2){
                fact *= n;
                n--;
            }
            // now we have the factorial we just have to count the number of trailing zeros
            int count = 0;
            while(fact % 10 == 0){
                count++;
                fact = fact / 10;
            }
            return count;
        }
    }

//    // efficient method - JUST COUNT NUMBER OF 5'S
//    class Solution {
//        public int trailingZeroes(int n) {
//            int count = 0;
//            while(n >= 5){
//                n /= 5;
//                count += n;
//
//            }
//            return count;
//        }
//    }

}
