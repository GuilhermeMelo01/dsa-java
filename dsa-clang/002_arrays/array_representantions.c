#include <stdio.h>
#include <stdlib.h>

int main(){

    /* When we declare array as a normal variable, it's saved in the stack memory.
       When we declare array as a pointer, the pointer variable in saved in the stack, but it points to the heap memory.
    */

    int A[5] = {2,4,5,6,1}; // static declaration
    int *p;

    p = (int*)malloc(5*sizeof(int)); // pointer declaration
    p[0] = 10;
    p[1] = 45;
    p[2] = 23;
    p[3] = 2;
    p[4] = 21;

    for(int i = 0; i<5; i++){
        printf("%d ", A[i]);
    }

    printf("\n");
    for(int i = 0; i<5; i++){
        printf("%d ", p[i]);
    }

    // INCREASING THE ARRAY

    int *b;
    b = (int*)malloc(10*sizeof(int));

    int length = sizeof(p) / sizeof(p[0]); // here I've the size of the array in bytes and the size of the first element in the array also in bytes
    for(int i = 0; i<length; i++){
        b[i] = p[i];
    }
    free(p);
    p = b;
    b = NULL;

    return 0;
}
