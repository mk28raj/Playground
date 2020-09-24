#include<stdio.h>
int main()
{
  int a,s,i;
   scanf("%d%d",&a);
	for (i=1;i<=a-1;i++)
    {
    if(a%i==0)
    {
    s=s+i;
    }
    }
 if(a<s)
 {
 printf("Abundant Number");
 }
  else
  {
  printf("Not Abundant Number");
  }
   
}