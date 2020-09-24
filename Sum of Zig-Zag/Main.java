#include<stdio.h>
int main()
{
  //fill your code
  int n,m,i,j,a[10][10],sum1=0;
scanf("%d%d",&n,&m);
  if(m==n)
  {
for(i = 0; i < n; i++)
{
  for(j=0;j<m;j++)
scanf("%d",&a[i][j]);
}
for(i=0;i<n;i+=(n-1))
 for(j=0;j<m;j++)
 sum1+=a[i][j];
  for(i=1;i<n-1;i++)
   for(j=m-1-i;j==m-1-i;j--)
      sum1+=a[i][j];
  printf("Sum of Zig-Zag pattern is %d",sum1);
}
 else
   printf("Zig-Zag pattern not exist");
}
