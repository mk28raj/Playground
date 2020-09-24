#include <stdio.h>

#define SIZE 3 

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
            sum += A[col][row];
        }

        printf("The sum of column %d: %d\n", row+1, sum);
    }

    return 0;
}