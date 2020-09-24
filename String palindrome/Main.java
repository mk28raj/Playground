#include <stdio.h>
#include <string.h>

int main()
{
   char text[20], reverse_text[20];
   int i,n, length = 0;

   for (i = 0; text[i] != '\0'; i++)
   {
      length++; //this will calculate the length of given text
   }
   //Reverse the original text and store into reverse_text
   for (i = length - 1; i >= 0; i--)
   {
      reverse_text[length - i - 1] = text[i];
   }

   //Check whether reverse_text is same to original text
   for (n = 1, i = 0; i < length; i++)
   {
      if (reverse_text[i] != text[i])
      n = 0;
   }

   if (n == 1)
      printf("not a palindrome");
   else
      printf("Palindrome");

   return 0;
}
