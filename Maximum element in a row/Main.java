#include<stdio.h>
int main()
{
  //fill your code
  int n,m;
  int a[n][m];
 scanf("%d%d",&n,&m);
  int imax=a[0][0];
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        scanf("%d",&a[i][j]);
        if(imax<a[i][j]){
            imax=a[i][j];
        }
    }
    printf("%d\n",imax);
    imax=a[i][0];
  }
}