import java.util.Scanner;

public class PerfectSquare{
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       boolean ans =func(n);
       if(ans){
        System.out.println("perfect square");
       }else{
        System.out.println("not perfect square");
       }
    }
}