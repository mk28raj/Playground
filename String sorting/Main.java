#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
  char ch, input[100], output[100];
  int no[26] = {0}, n, c, t, x;

  printf("The sorted string is ");
  scanf("%s", input);

  n = strlen(input);

  for (c = 0; c < n; c++)
  {
    ch = input[c] - 'a';
    no[ch]++;
  }

  t = 0;

  for (ch = 'a'; ch <= 'z'; ch++)
  {
    x = ch - 'a';

    for (c = 0; c < no[x]; c++)
    {
      output[t] = ch;
      t++;
    }
  }
  output[t] = '\0';

  printf("%s", output);

  return 0;
}