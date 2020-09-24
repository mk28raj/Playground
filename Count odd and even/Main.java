#include<stdio.h>
int main()
{
  //fill your code
  {
  int n,i,even=0,odd=0;
  scanf("%d",&n); // no.of elements
  int *a;
  a=(int *) malloc(n*sizeof(int)); // dynamic array 
  for(i=0;i<n;i++)
  {
    scanf("%d",a+i); 	//got the values
  }
  for(i=0;i<n;i++)
  {
  if(*(a+i)%2==0) 	//check for even or odd
  {
    even++; 	// even count increases
  }
else
{
  odd++;		//odd count increases
}
  }
  printf("Odd: %d\n" ,odd);
  printf("Even: %d",even);
return 0;
  }
}