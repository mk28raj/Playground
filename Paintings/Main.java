#include<stdio.h>
int main()
{
  //fill your code
  int l,b;
  int c,d,e,f;
  scanf("%d%d%d%d%d%d",&l,&b,&c,&d,&e,&f);
  if(l>=c+e&&b>=d+f)
   printf("Raj can fix both painting");
    else
      printf("Raj cannot fix both painting");
}