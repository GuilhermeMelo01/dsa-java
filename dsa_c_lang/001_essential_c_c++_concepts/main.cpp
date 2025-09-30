#include <iostream>

using namespace std;

struct Rectangle {  // It'll consume 4 bytes total
    int length; // 2 bytes
    int breadth; // 2 bytes
};

int main()
{
    struct Rectangle rectangle = {10, 5};

    cout<< rectangle.length <<endl;

    /*
    REFERENCE
    */
    return 0;
}
