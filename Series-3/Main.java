#include<stdio.h>
int main()
{
  //Fill your code
  int n, a=5,i;
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