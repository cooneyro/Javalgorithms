//
// Created by Rob on 06/04/2017.
//

#ifndef POINTERS_Q112DARRAYMALLOC_H
#define POINTERS_Q112DARRAYMALLOC_H


#include <cstdlib>

class Q112DArrayMalloc {

    int** my2DAlloc(int rows, int cols){
        int i;
        int** rowptr;
        rowptr = (int**) malloc(rows * sizeof(int*));
        for(i=0;i<rows;i++){
            rowptr[i] = (int*)malloc(cols * sizeof(int));
        }
        return rowptr;

    }
};


#endif //POINTERS_Q112DARRAYMALLOC_H
