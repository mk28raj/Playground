#include<stdio.h>
int main()
{
  //fill your code
  char name[20];
  int a,b;
  float c;
  scanf("%s",&name);
  scanf("%d",&a);
  scanf("%d",&b);
  scanf("%f",&c);
  printf("%s \n",name);
  printf("%d \n",a);
  if(b==0 && c>=7.0)
  {
    printf("Eligible to attend placment");
  }
  else if(b<=2 && c>=7.5)
  {
     printf("Eligible to attend placment");
  }
  else
  {
      printf("Not Eligible to attend placement");
  }
}