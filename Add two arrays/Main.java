#include <stdio.h>
int main()
{
  int m;
  scanf("%d",&m);
int i,a[m],b[m],c[m];
  
 for (i=0;i<m;i++)
 {
   scanf("%d",&a[i]);
   }
 for (i=0;i<m;i++)
   {
   scanf("%d",&b[i]);
   }

   for(i=0;i<m;i++)
     {
     c[i]=a[i]+b[i];
     printf("%d ",c[i]);
   }
   return 0;
}