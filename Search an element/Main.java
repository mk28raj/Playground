#include<stdio.h>
int main()
{
  //fill your code
  int array[100], ele, c, n;
scanf("%d", &n);
for (c = 0; c < n; c++)
scanf("%d", &array[c]);
scanf("%d", &ele);
for(c = 0; c < n ; c++)
{
if(array[c] == ele)
printf("%d is present in the array",ele);
   else
  {
    printf("%d is not present in the array",ele);
}
return 0;
}
}