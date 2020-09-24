#include<stdio.h>
int main()
{
  int n,a=-1,i;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=1;i<=n*2;i++)
  {
    if(i%2!=0)
    {
      a=a+i;
      printf("%d ",a);
    }
  }
  return 0;
}