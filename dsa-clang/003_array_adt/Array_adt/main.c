#include <stdio.h>
#include <stdlib.h>

struct Array {
    int A[20];
    int size;
    int length;
};

void Display(struct Array arr){
    int i;
    printf("\nElements are\n");
    for(i=0; i<arr.length;i++){
        printf("%d ", arr.A[i]);
    }

}

int main(){

    struct Array arr = {{1,3,5,10,2}, 20, 5};

    Display(arr);

    return 0;
}


