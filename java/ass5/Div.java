import java.io.*;
import java.util.*;
public class Div{

//the function here
public static int func(int n,int num1, int num2){
if((n%num1==0) && (n%num2==0)){return 1;}
else{
	
	
	return 0;
}

}



public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num1=sc.nextInt();
int num2=sc.nextInt();
int res=func(n,num1,num2);
if(res==1){System.out.println("true");}
else{
System.out.println("false");
}

}


}