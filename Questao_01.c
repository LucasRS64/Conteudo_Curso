#include <stdio.h>

int main(void) {

    int numero = 5;
    int fat = 1;

    for (int i = 1;i <= numero; i++) {
         fat = i * fat; 
    }

    int total = fat; 

    printf("Total: %d\n", total);
}