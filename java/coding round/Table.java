import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.print(i*n+" ");
            sum=sum+i*n;
        }
        System.out.println();
        System.out.println(sum);
        
    }
    
}
