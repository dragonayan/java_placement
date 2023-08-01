#include<stdio.h>
void main() 
{ 
 int i=0; 
 while(+(+i--)!=0) 
 i=i+5; 
 printf("%d",i); 
}