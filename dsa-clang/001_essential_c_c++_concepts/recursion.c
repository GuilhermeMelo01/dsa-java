#include <stdio.h>

void fun(int n){
    if(n > 0){
        printf("%d", n);
        fun(n-1);
        fun(n-1);
    }
}

int sumOfFirstNNaturalNumbers(int n){
    static int sum = 0;
    if(n < 1){
        return sum;
    }
    sum += n;
    return sumOfFirstNNaturalNumbers(n-1);
}

int factorialOfNumber(int n){
    static int sum = 1;
    if(n == 0){
        return sum;
    }

    sum *= n;
    return factorialOfNumber(n-1);
}

int exponentOfNumber(int n, int base){
    if(base == 0){
        return 1;
    }
    return exponentOfNumber(n, base-1)*n;
}

int exponentInterative(int n, int base){
    int result = 1;
    for(int i = base; base > 0; base--){
        result *= n;
    }

    return result;
}

int main(){
    /*
    We have 5 types of recursion

    1. Tail Recursion
        - When the call to recursion is the last statement of the function.
            void fun(int n){
                if(n > 0){
                    printf("%d", n);
                    fun(n-1); // Last statement
                }
            }

    2. Head Recursion
        - When the call to recursion is the first action inside of the function.
             void fun(int n){
                if(n > 0){
                    fun(n-1); // first action
                    /////
                    /////
                    /////
                }
            }

    3. Tree Recursion
        - When the call to recursion is used more than one time inside of the function
            void fun(int n){
                if(n > 0){
                    fun(n-1); // first call
                    /////
                    /////
                    fun(n-1); // second call
                    /////
                }
            }

    4. Indirect Recursion
        - Occurred when we have some function called other function that's also called the previous function.
            void funA(int n){
                if(n > 0){
                    funB(n-1); // call the funB
                    /////
                    /////
                }
            }
            void funB(int n){
                if(n > 1){
                    funA(n/2); // call the funA
                    /////
                    /////
                }
            }

    5. Nested Recursion
        - Occurred when the function parse itself as parameter to call itself. ??? :)
            int fun(int n){
                if(n > 100){
                    return n - 10;
                }else{
                    return fun(fun(n+11)); // here we parse the function itself as parameter.
                }
            }
    */

    //int result = sumOfFirstNNaturalNumbers(5);
    //int result = factorialOfNumber(6);

    int result = exponentInterative(2, 5);
    printf("%d\n", result);
    return 0;
}



