#include<stdio.h>
int main()
{
  int a,b,c,d,i,j,n,m,count;
  scanf("%d",&n);
  a=100;
  
  while(n!=0)
  {
    count=0;
    for(j=2;j<=a/2;j++)
    {
    if(a%j==0)
      count=count+1;
    }
    if(count==0)
    {
      printf("%d ",a);
      n--;
  }
    a++;
    
    
}
}