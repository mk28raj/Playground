#include<stdio.h>
int main()
{
int a,b,c,pro,i,mul=1;
  scanf("%d",&a);
  for(i=a;i>0;i--)
  {
    mul=(a)*mul;
    a=a-1;

}
  printf("%d",mul);
}