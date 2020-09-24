#include<stdio.h>
int main()
{
  int a,rem,que,b=0;
  scanf("%d",&a);
  rem=a%10;
  que=a/10;
  b=b+rem+que;
  printf("%d",b);
}