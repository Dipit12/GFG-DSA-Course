package ArrayAndArrayList;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = {
                {1,2,3},
                {1,2},
                {12}
        };
        // printing this matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        // taking in input
        int[][] arr = new int[3][2];
        for(int row = 0; row < arr.length;row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }
        // another way to print the arr
        for(int[] a: arr){
            System.out.println(a);
        }
    }
}
