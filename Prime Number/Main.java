#include<stdio.h>
int main()
{
  //Fill your code
  int num,i,ctr=0;
    scanf("%d",&num);
    for(i=2;i<=num/2;i++){
        if(num % i==0){
         ctr++;
            break;
        }
    }
   if(ctr==0 && num!= 1)
        printf("Prime",num);
   else
      printf("Not prime",num);
}