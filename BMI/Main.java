#include<stdio.h>
int main()
{
  //fill your code
  float w,h,b;
  scanf("%f%f",&w,&h);
  b=w/(pow(h,2)*pow(0.01,2));
  if(b>18.5 && b<=25)
  {
    printf("You are normal. Go walking daily and maintain it.");
  }
  else if(b<18.5)
  {
    printf("You are underweight. Have an apple daily.");
  }
  else 
  {
    printf("You are obese. Go to doctor");
  }
}