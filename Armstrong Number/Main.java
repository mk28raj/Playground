#include<stdio.h>
int main()
{
  //fill your code
  int num, originalNum, remainder, result = 0;
 
    scanf("%d", &num);
    originalNum = num;

    while (originalNum != 0) {
        remainder = originalNum % 10;
        
       result += remainder * remainder * remainder;
        
       originalNum /= 10;
    }

    if (result == num)
        printf("Armstrong Number", num);
    else
        printf("Not Armstrong Number", num);

    return 0;
}