#include<stdio.h>
int main()
{
  //fill your code
  int g,h,i,j;
  float a,b,c,d;
  float e,f;
  scanf("%f",&a);
  b=a*0.5;
  c=a*0.65+100;
  d=a*0.80+200;
  e=a*1.25+425;
  g=round(b);
  h=round(c);
i=round(d);
 j=round(e);
        if(a<=200)
        {
          printf("Rs.%d",g);
                 }
       else if(a>=200&&a<=400)
                 {
                   printf("Rs.%d",h);
                 }
        else if(a>=400&&a<=600)
                {
                  printf("Rs.%d",i);
                }
                else
                {
                  printf("Rs.%d",j);
                }
}