import java.util.*;

class LuckyNumber {
    public static int func(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], 1);
            } else {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            int num=m.getKey();
            int ans=m.getValue();
            if(num==ans){
                return Math.max(max,num);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = { 1,1,1,1,2,2,3,4 };
        int ans = func(arr);
        System.out.println(ans);
    }
}