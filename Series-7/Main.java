#include<stdio.h>
int main()
{
  int a,b,c,d,i,n;
  printf("Enter n value\n");
  scanf("%d",&n);
  a=1;
  b=10;
  printf("%d ",b);
  for(i=2;i<=n;i++)
  {
    if(i%2==0)
    {
      c=5*a;
        printf("%d ",c);
      a=a+2;
    }
    else
    {
      d=b+50;
      printf("%d ",d);
      b=d;
    }
  }
}