#include <stdio.h>

int main(){

    /*
    int A[3][4]; -> It's create an array with 3 rows X 4 columns
    [[][][][]]
    [[][][][]]
    [[][][][]]

    In memory the values with be allocated in linear position 3x4 -> [][][][][][][][][][][][]
    */

    /*
    To create the 2D array in heap, we do like this:

    int *A[3]; -> create an array pointer of size 3
        0[]
        1[]
        2[]

    A[0] = new int[4]; -> and put an array of size 4 inside of the first position.
    A[1] = new int[4];
    A[2] = new int[4];
        0[] -> [][][][]
        1[] -> [][][][]
        2[] -> [][][][]
    */

    return 0;
}
