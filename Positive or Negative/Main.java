#include<stdio.h>
int main()
{
  int A;
   scanf("%d", &A); 
  
    if (A > 0) 
        printf("Positive", A); 
    else if (A < 0) 
        printf("Negative", A); 
    else if (A == 0) 
        printf("Zero", A); 
   return 0; 
}