#include<stdio.h>
int main()
{
int a,b,i,c,n,d,count1=2,count=0;
 scanf("%d",&n);
   a=0;
      b=1;
  for(i=0;i<n;i++)
  {
    c=a+b;
     a=b; 
      b=c; 
   
   if( c==n)
    {
      count=count+1;
    
    }
  }
   
  if(count==1)
  {
    printf("Fibonacci Number");
   
  }
    else
    {
      printf("Not Fibonacci Number");
    
    }
}