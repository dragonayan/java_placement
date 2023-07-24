import java.io.*;
import java.util.*;

class Ratproblem{

static int result(int r,int unit,int n, int[] arr){
int ans=r*unit;
int sum=0,count=0;
for(int i=0;i<n;i++){
sum+=arr[i];
if(sum<ans){
count++;
}
}
return count+1;
}


public static void main(String[] args){

int r,unit,n;
Scanner sc=new Scanner(System.in);
r=sc.nextInt();
unit=sc.nextInt();
n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int anss=result(r,unit,n,arr);
System.out.println(anss);
}
}