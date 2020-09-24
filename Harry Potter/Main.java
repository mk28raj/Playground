#include<stdio.h>
int main()
{
  int a,sam,b;
  scanf("%d",&a);
  b=(a/1000)+(((a%1000)%100)%10);
  printf("%d",b);
}