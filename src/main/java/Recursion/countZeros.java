package Recursion;

public class countZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(1001));
    }

    static int countZeros(int n) {
        // Base case: when n is 0, stop recursion
        if (n == 0) {
            return 0;
        }

        int rem = n % 10;
        int count = (rem == 0) ? 1 : 0;

        return count + countZeros(n / 10);
    }
}

