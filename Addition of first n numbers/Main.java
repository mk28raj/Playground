#include <iostream>
int sum(int);
int main()
{
int n;
  int ans;
  scanf("%d",&n);
  ans=sum(n);
  printf("%d",ans);
}
int sum(int n)
{
  if(n==0 || n==1)
  {
    return 1;
  }
  else
  {
    return (n+sum(n-1));
  }
}