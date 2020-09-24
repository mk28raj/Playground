#include<stdio.h>
int main()
{
  //fill your code
  int a[10][10],m,n,i,j,sum=0;
  scanf("%d%d",&m,&n);
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
 for(int i=0;i<m;i++) {
   for(int j=0;j<n;j++) {
     if(i==0 || i==m-1 || j==0 || j==n-1)
       sum+=a[i][j];
   }
 }
  printf("Sum of boundaries is %d",sum);
}