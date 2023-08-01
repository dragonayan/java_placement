import java.io.*;
import java.util.*;
class Sum{
public static int func(int m,int n){
int sum1=0;
int sum2=0;
for(int i=1;i<=m;i++){
if(i%n!=0){
sum1+=i;
}
if(i%n==0){
sum2+=i;}

}return Math.abs(sum1-sum2);

}

public static void main(String[] args){



Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int res=func(m,n);
System.out.println(res);



}
}