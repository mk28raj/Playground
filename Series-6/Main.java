#include<stdio.h>
#include<math.h>
int main()
{
  int a,b,c,d,i,n;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    a=pow(i,i);
    printf("%d ",a);
}
}