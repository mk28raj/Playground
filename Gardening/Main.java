#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  if(a==b&&c%a<=0)
    printf("It is a mango tree");
  else
    printf("It is not a mango tree");
}