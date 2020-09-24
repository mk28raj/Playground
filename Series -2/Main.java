#include<stdio.h>
int main()
{
  //Fill your code
  int i, n, t1 = 1, t2 = 2, nextTerm;
    scanf("%d", &n);
  printf("Enter n value\n");
    for (i = 1; i <= n; ++i) {
        printf("%d ", t1);
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }

    return 0;
}