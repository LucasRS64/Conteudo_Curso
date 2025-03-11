#include <stdio.h>

int main() {
    int y = 5;
    int fiboninha;
    for (int i = 2, a = 0, b = 1; i <= y; i++) {
        fiboninha = a + b;
        a = b;
        b = fiboninha;
    }      
    
    printf("Por fibonacci = %d\n", fiboninha);
    return 0;
}