#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c,d,e,f,g,h,i;
  scanf("%d%d%d%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f,&g,&h,&i);
a=(a/2)+b;
  d=(d/2)+f;
  g=g+(2*h)+(i/2);
  printf("In Flipkart: Rs.%d\n",a);
  printf("In Snapdeal: Rs.%d\n",d);
  printf("In Amazon: Rs.%d\n",g);
  printf("He will prefer Snapdeal");
}