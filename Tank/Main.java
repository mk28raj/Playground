#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c,d;
  int e,f;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  e=a*b;
  f=d*60;
  if(e<f&&c>50)
    printf("The tank can be filled within 6.0 hours");
  else
    printf("The tank cannot be filled within 3.0 hours");
}