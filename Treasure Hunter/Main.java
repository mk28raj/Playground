#include<stdio.h>
int main()
{
  int a1,a2,a3,lbs,bbs,ps;
  scanf("%d%d%d",&a1,&a2,&a3);
  lbs=(a1*a2)/100;
  bbs=((a1-lbs)*a3)/100;
  ps=(a1-lbs-bbs)/3;
  printf("%d\n%d\n%d",lbs,bbs,ps);
}