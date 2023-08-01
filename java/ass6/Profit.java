
import java.io.*;
import java.util.*;

public class Profit{
public static int func(int[] arr, int size){
ArrayList<Integer> ans=new ArrayList<>();

for(int i=0;i<arr.length-1;i++){
if(arr[i]<arr[i+1]){
ans.add(arr[i+1]-arr[i]);
}
}
int sum=0;
for(int i=0;i<ans.size();i++){
	sum+=ans.get(i);
	
}


return sum;

}

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int[] arr=new int[size];
for(int i=0;i<size;i++){
arr[i]=sc.nextInt();
}
int ans=func(arr,size);
System.out.println(ans);


}



}