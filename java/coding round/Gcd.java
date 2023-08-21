import java.util.*;

public class Gcd {
    public static int gcd(int a,int b){
    int min=Math.min(a,b);
    int max=Math.max(a,b);

    while(min>1){
        if(max%min==0){return min;}
        else {
            min=max%min;

        }
    
    }return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = gcd(num1, num2);
        System.out.println(ans);
    }

}
