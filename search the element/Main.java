#include <stdio.h>
int recursiveBinarySearch(int array[], int start_index, int end_index, int element){
   if (end_index >= start_index){
      int middle = start_index + (end_index - start_index )/2;
      if (array[middle] == element)
         return middle;
      if (array[middle] > element)
         return recursiveBinarySearch(array, start_index, middle-1, element);
      return recursiveBinarySearch(array, middle+1, end_index, element);
   }
   return -1;
}
int main(void){
   int array[] = {5,1,2,3,4,5,5};
   int n = 7;
   int element = 5;
   int found_index = recursiveBinarySearch(array, 0, n-1, element);
   if(found_index == -1 ) {
      printf("Element not found in the array ");
   }
   else {
      printf("%d",found_index);
   }
   return 0;
}