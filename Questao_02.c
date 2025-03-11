#include <stdio.h>

int fator(int x) {
    if (x == 0 || x == 1) {
        return 1;
    }
    return  x * fator(x-1);
}

int main() {

    int z = 5;
    
    printf("Total: %d\n",fator(z));
    return 0;
}