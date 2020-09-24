#include<stdio.h>
int main()
{
   int p,r,t;
  float in,tot,dis,pay;
  scanf("%d",&p);
  scanf("%d",&t);
  scanf("%d",&r);
  tot=p*(1+0.01*r*t);
  in=tot-p;
  dis=0.02*in;
  pay=tot-dis;
  printf("%0.2f\n",in);
  printf("%0.2f\n",tot);
  printf("%0.2f\n",dis);
  printf("%0.2f\n",pay);
}