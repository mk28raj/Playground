#include <stdio.h>
int main()
{
    int first, second, add, subtract, multiply,md;
    float divide;
    
    scanf("%d%d", &first, &second);
    add        = first + second;
    subtract = first - second;
    multiply = first * second;
    md=first%second;
    divide     = first / (float)second;   //typecasting
    printf("%d\n",add);
    printf("%d\n",subtract);
    printf("%d\n",multiply);
    printf("%d\n",md);
    printf("%.0f\n",divide);
    
    return 0;
}