import java.util.*;

class HelloWorld {
    public static void isSquare(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.print(max + " ");
        System.out.print(index);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 7,12,4,1,5,6,9 };
        isSquare(arr);
    }
}