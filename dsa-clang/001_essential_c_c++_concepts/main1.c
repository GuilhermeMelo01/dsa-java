#include<stdio.h>
#include<stdlib.h>

struct Rectangle {  // It'll consume 4 bytes total
    int length; // 2 bytes
    int breadth; // 2 bytes
};

struct Student {
    int roll; // 2 bytes
    char name[25]; // 25 bytes
    char dept[10]; // 10 bytes
    char address[50]; // 50 bytes
};

int main(){

    struct Rectangle r = {10, 5};
    printf("Length: %d\n", r.length);

    struct Student s = {10, "Guilherme", "Enginner", "Street Eleven"};
    printf("Student name: %s\n", s.name);


    /*
    POINTERS
    . Pointer is an address variable, so it's hold the address to the data, not the data itself.

    . Pointers are great to indirectly access the data.

    . Let's say you want to access heap memory, resources or to parameters passing, you should use pointers to archive what you want.
    */

    /* int a = 10;
    int *p;
    p = &a;

    printf("%d\n", a);
    printf("%d\n", *p);
    */

    int *p;
    p = (int *) malloc(5*sizeof(int)); // let's say int uses 2 bytes, so it'll be 5x2 = 10 bytes in heap memory
    printf("%d\n", *p);



    return 0;
}
