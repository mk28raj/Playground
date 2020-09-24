#include<stdio.h>
int main()
{
  //Fill your code
  float m,D;
  int l,d;
  scanf("%f%d%d",&m,&l,&d);
  D=m*l;
  if(round(D)>=d)
  {
    printf("Can reach");
  }
  else
  {
    printf("Cannot reach");
  }
}