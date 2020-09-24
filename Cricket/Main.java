#include<stdio.h>
int main()
{
  //Fill your code
  int tb,tr,r,b;
  int ov;
  float cr,trun,of;
  scanf("%d%d%d%d",&tb,&tr,&r,&b);
  ov=tb/6;
  of=(b/6+((b%6)/6.0)*0.6);
  cr=r/of;
  trun=tr/(float)ov;
  printf("%d\n%0.1f\n%0.1f\n%0.1f\n",ov,of,cr,trun);
  if(cr>trun)
  {
    printf("Eligible to Win");
   }
  else 
  {
    printf("Not Eligible to Win");
  }
}