#include <stdio.h>
union employee{
  char name[20];
  int  salary;
};
int main()
{
  union employee emp;
  printf("Enter the Employee details\n");
  printf("Enter the Employee name\n");
  scanf("%s",emp.name);
  printf("Enter the Employee salary\n");
  printf("\nEmployee Details\n");
  scanf("%d",&emp.salary);
  printf("%s  %d",emp.name,emp.salary);
} 

