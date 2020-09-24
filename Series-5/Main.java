#include<stdio.h>
int main()
{
  int a,b,c,d,i,n;
  scanf("%d",&n);
  a=2;
  b=2;
  printf("%d ",a);
  for(i=0;i<n-1;i++)
  {
    c=((a+1)*2)-b;
    printf("%d ",c);
    a=c;
    b++;
}
}