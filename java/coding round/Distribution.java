import java.util.Scanner;

public class Distribution{

    public static int func(int n,int m){
        if(n==1){
            return m;
        }
        return func(n-1, m)+1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=func(x,y);
        System.out.println(ans);
    }
}