import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], 1);
            } else {
                mp.put(arr[i], mp.get(arr[i]) + 1);
           
        }
    }
        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
