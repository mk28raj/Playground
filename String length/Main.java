#include <stdio.h>
#include <string.h>
int main()
{
  char a[100];
  int length;

  gets(a);

  length = strlen(a);

  printf("The length of Face is %d\n", length);

  return 0;
}