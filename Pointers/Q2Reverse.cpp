//
// Reversing a null terminated string
//

#include "Q2Reverse.h"

void Q2Reverse::reverse(char* str){
    char* end = str;
    char* start = str;
    char tmp;
    if(str){
        while(end){
            end++;
        }
        end--;

        while(str<end){
            tmp = *str;
            *str++ = *end;
            *end-- = tmp;
        }
    }

}
