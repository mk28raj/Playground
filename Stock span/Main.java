#include<stdio.h>
int main()
{
  int days,op=1,count=1;
  scanf("%d",&days);
  int a[days],b[days];
  for(int i=0;i<days;i++)
  {
    scanf("%d",&a[i]);
  }
  printf("1\n");
  for(int i=0;i<days;i++)
  {
    if(i>=1){
    for(int j=0;j<=i;j++)
    {
      if(a[j]<a[i]){count++;}
      //printf("%d less< %d\n",a[j],a[i]);
      //printf("count = %d\n",count);
      
    }
      op=count;
      count=1;
      printf("%d\n",op);
    }
  }
}

