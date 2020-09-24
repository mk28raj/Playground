#include<stdio.h>
int main()
{
  int x,y;
  scanf("%d",&x);
  scanf("%d",&y);
  if(x>0 && y>0)
  {
    printf("Ist Quadrant");
  }
  else if(x<0 && y>0)
  {
    printf("IInd Quadrant");
  }
  else if(x<0 && y<0)
  {
    printf("IIIrd Quadrant");
  }
  else if(x>0 && y<0)
  {
    printf("IVth Quadrant");
  }
  else
  {
    printf("origin");
  }
  return 0;

}