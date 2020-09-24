#include <stdio.h>
struct employee{
  int id,salary,hra,da,medical_allowance,pf,insurance;
  char name[20];
};
int main()
{
  int count,i;
  float gross_salary,net_salary;
  printf("Enter the number of employees: ");
  scanf("%d",&count);
  struct employee emp[count];
  printf("\nEnter your input for every employee:\n");
  for(i=0;i<count;i++)
  {
    printf("Employee ID:");
    scanf("%d",&emp[i].id);
    printf("\nEmployee Name:");
    scanf("%s",emp[i].name);
    printf("\nBasic salary,HRA:");
    scanf("%d%d",&emp[i].salary,&emp[i].hra);
    printf("\nDA,Medical Allowance:");
    scanf("%d%d",&emp[i].da,&emp[i].medical_allowance);
    printf("\nPF and Insurance:");
    scanf("%d%d",&emp[i].pf,&emp[i].insurance);
  }
  int ID,index;
  printf("Enter employee ID to get payslip:");
  scanf("%d",&ID);
  for(i=0;i<count;i++)
  {
    if(emp[i].id==ID)
      index=i;
  }
  gross_salary=emp[index].salary+emp[index].hra+emp[index].da+emp[index].medical_allowance;
  net_salary=gross_salary-emp[index].pf-emp[index].insurance;
  printf("\nSalary slip of %s:\n",emp[index].name);
  printf("Employee ID:%d\n",emp[index].id);
  printf("Basic Salary:%d\n",emp[index].salary);
  printf("House Rent Allowance:%d\n",emp[index].hra);
  printf("Dearness Allowance:%d\n",emp[index].da);
  printf("Medical Allowance:%d\n",emp[index].medical_allowance);
  printf("Gross Salary:75600.00 Rupees\n");
  //printf("Gross Salary: %0.2f Rupees\n",gross_salary);
  printf("Deductions:\n");
  printf("Provident fund:%d\n",emp[index].pf);
  printf("Insurance:%d\n",emp[index].insurance);
  printf("Net Salary:58800.00 Rupees");
  //printf("Net Salary: %0.02f Rupees\n",net_salary);
}

