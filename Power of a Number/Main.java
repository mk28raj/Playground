#include <iostream>
 long power (int, int);
 
int main()
{
    int pow, num;
    long result;
    scanf("%d", &num);
    scanf("%d", &pow);
    result = power(num, pow);
    printf("%ld",result);
    return 0;
}
 
long power (int num, int pow)
{
    if (pow)
    {
        return (num * power(num, pow - 1));
    }
    return 1;
}