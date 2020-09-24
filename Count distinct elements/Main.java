#include<stdio.h>
int main()
{
int n,i,j,k,a[50],c=0;
scanf("%d",&n);
for(int i = 0; i < n; i++)
{
scanf("%d",&a[i]);
}
 
for(i=0;i<n;i++)
  {
  for(j=i+1;j<n;j++)
  {
   if(a[i]==a[j])
  a[j]=-1;
}
}
  
  for(int i = 0; i < n; i++)
  {if(a[i]!=-1)
c++;
  }
    printf("There are %d distinct elements in the array.",c);
  
}