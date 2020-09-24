#include<stdio.h>
int main()
{
  //fill your code
  int n,m,i,j,a[10][10],b[10][10],c[10][10];
scanf("%d%d",&n,&m);
for(i = 0; i < n; i++)
{
  for(j=0;j<m;j++)
scanf("%d",&a[i][j]);
}
  for(i = 0; i < n; i++)
{
  for(j=0;j<m;j++)
scanf("%d",&b[i][j]);
}
 
for(i=0;i<n;i++)
  {
  for(j=0;j<m;j++)
  {
   c[i][j]=b[i][j]-a[i][j];
  }
}
  printf("The Result is:\n");
 for( i = 0; i < n; i++)
{
  for(j=0;j<m;j++)
  {printf("%d ",c[i][j]);
   if (j == m- 1) 
         printf("\n");
  }
 }
}