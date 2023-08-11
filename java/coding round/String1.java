import java.util.*;

public class String1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        // String s = sc.next();
        String s="bbbaaccb";
        char[] p = s.toCharArray();
        for (int i = 0; i < p.length; i++) {
            count = 0;
            for (int j = i + 1; j < p.length; j++) {
                if (p[i] == p[j]) {
                    count++;
                }
            }
            arr.add(count);
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
