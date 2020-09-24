#include<stdio.h>
int main()
{
  //fill your code
  int m,y;
  scanf("%d%d",&m,&y);
  if (y%4==0 && m==2)
  {
    printf("Number of days is 29");
  }
  else if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
  {
  printf("Number of days is 31");  
  }
  else if (m==4 || m==6 || m==9 || m==11)
  {
  printf("Number of days is 30");  
  }
  else 
  {
  printf("Number of days is 28");
  }
}