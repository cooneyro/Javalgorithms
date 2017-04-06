#include <string>
#include <iostream>
#include "Q2Reverse.h"


int main() {
    std::string myString = "Some text";
    std::cout << "Hello, World!" << std::endl;

    //pointers
    int * p = new int;
    *p = 7;
    int * q = p;
    *p = 8;
    std::cout << "Q equals: " << *q << std::endl;

    //references
    int a = 5;
    int & b = a;
    b = 7;
    std::cout << "A equals: " << a << std::endl;

    int * c = new int[2];
    c[0] = 0;
    c[1] = 1;
    c++;
    std::cout << "C equals: " << *c << std::endl;


    return 0;
}