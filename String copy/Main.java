#include <stdio.h>
#include <string.h>
int main()
{
  char source[1000], destination[1000];
  gets(source);

  strcpy(destination, source);

  printf("The copied string is %s.\n", destination);

  return 0;
}

