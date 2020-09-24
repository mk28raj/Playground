#include<stdio.h>
int main()
{
  //Fill your code
  int n, reversedN = 0, remainder, originalN;
    scanf("%d", &n);
    originalN = n;
    while (n != 0) {
        remainder = n % 10;
        reversedN = reversedN * 10 + remainder;
        n /= 10;
    }

    if (originalN == reversedN)
        printf("Same", originalN);
    else
        printf("Not Same", originalN);

    return 0;
}