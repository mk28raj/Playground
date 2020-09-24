#include<stdio.h>
int main()
{
  int a,b1,b2,b3;
  scanf("%d",&a);
  b1=(a/365);
  b2=(a/373);
  b3=(a/373);
  printf("%d\n%d\n%d",b1,b2,b3);
}