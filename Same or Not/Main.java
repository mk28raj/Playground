#include<stdio.h>
int main()
{
 int n,a[n],i,sum1=0,m,b[m],sum=0;
  scanf("%d%d",&n,&m);
  
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
    sum=sum+a[i];
  }
 for(i=0;i<=m-1;i++)
  {
    scanf("%d",&b[i]);
    sum1=sum1+b[i];
 }
  if((n==m)&&(sum==sum1))
  {
    printf("Same");
  }
  else
  {
    printf("Not Same");
  }
}