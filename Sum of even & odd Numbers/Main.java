#include<stdio.h>
int main()
{
  int a,b,c,g,h,sum,sum1;
  float d,e,f,count=0,count1=0;
  scanf("%d",&a);
  while(a!=-1)
  {
  if((a%2==0))
  {
      sum=sum+a;
      scanf("%d",&a);
    count=count+1;
  }
     
  else if((a%2!=0))
  {
    sum1=sum1+a;
    scanf("%d",&a);
    count1=count1+1;
  }   
  }
     printf("%d\n",sum);
     printf("%d\n",sum1);


  d=sum/count;
  e=sum1/count1;
 
   printf("%0.2f\n",d);
  printf("%0.2f\n",e);
}