#include <stdio.h>

#define SIZE 3 // Matrix size

int main()
{
    int n,m,A[SIZE][SIZE];
    int row, col, sum = 0;
scanf("%d%d",&n,&m);
   
    for(row=0; row<SIZE; row++)
    {
        for(col=0; col<SIZE; col++)
        {
            scanf("%d", &A[row][col]);
        }
    }

    for(row=0; row<SIZE; row++)
    {
        sum = 0;
        for(col=0; col<SIZE; col++)
        {
            sum += A[row][col];
        }

        printf("The sum of row %d: %d\n", row+1, sum);
    }
    return 0;
}