#include<stdio.h>
int main()
{
  //fill your code
  int a[50][50],i,j,m,b[50][50];
  scanf("%d",&m);
  for(i=0;i<m;i++)
  {
    for(j=0;j<m;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<m;j++)
    {
      printf("%d ",a[i][j]);
    }
    printf("\n");
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<m;j++)
    {
      b[j][i]=a[i][j];
    }
  }
  printf("Transpose matrix is :\n");
  for(i=0;i<m;i++)
  {
    for(j=0;j<m;j++)
    {
      printf("%d ",b[i][j]);
    }
    printf("\n");
  }
}