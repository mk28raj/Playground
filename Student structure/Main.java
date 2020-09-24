#include<stdio.h>
struct student
{
  int rn,s1,s2,s3,s4,s5;
  float avg;
};
int main()
{
  int n;
  printf("STUDENT MARKSHEET USING STRUCTURES\nEnter the no of students\n");
  scanf("%d",&n);
  struct student keydata[n];
  for(int i=0;i<=n-1;i++)
  {
 	 scanf("%d %d %d %d %d %d",& keydata[i].rn, &keydata[i].s1,&keydata[i].s2,&keydata[i].s3,&keydata[i].s4,&keydata[i].s5);
  	keydata[i].avg=(keydata[i].s1+keydata[i].s2+keydata[i].s3+keydata[i].s4+keydata[i].s5)/5;
  }
  printf("\nrn s1 s2 s3 s4 s5 avg grade\n\n");
  for(int i=0;i<=n-1;i++)
  {
   
  	printf("%d %d %d %d %d %d %0.2f ",keydata[i].rn,keydata[i].s1,keydata[i].s2,keydata[i].s3,keydata[i].s4,keydata[i].s5,keydata[i].avg);
  	if(keydata[i].avg>70)
 		 {   printf("1\n");
 	 }else if(keydata[i].avg<=70 && keydata[i].avg>=50)
  	{ printf("2\n");
  	}
 	 else
  		{ printf("3\n");
  		}
  }
  return 0;

}