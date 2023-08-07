import java.util.*;

class Ans {
    public static void func(int[] arr, int k) {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        int size = arr.length;
        while (j < size) {
            if (j - i + 1 < k) {
                if (arr[j] < 0) {
                    ans.add(arr[j]);
                }
                j++;
                
            } 
            else if (j - i + 1 == k) {
                i++;
                j++;
                if(arr[i]<0){
                    ans.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(ans);

    }
}

public class FindNegative {

    public static void main(String[] args) {
        int[] arr = { 1, -3, 2, -4, 5, -9, 2, 4, 7 };

        Ans.func(arr, 3);
    }
}
