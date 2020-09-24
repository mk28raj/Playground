#include <stdio.h>
#include <math.h>
 
int main()
{
    float val;
    float fVal,cVal;
    scanf("%f",&val);
    fVal=floor(val);
    cVal =ceil(val);
    printf("%0.f\n%0.1f\n%0.1f\n",fVal,cVal,fVal);
    return 0;
}
