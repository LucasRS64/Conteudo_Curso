#include <stdio.h>

int fibona(int x) {
    if (x == 0) {
        return 0;
    } else if (x == 1) {
        return 1;
    } else {
        return fibona(x - 1) + fibona(x - 2);
    }
}

int main() {
    int y = 5;
    printf("Por fibonacci = %d\n", fibona(y));
    return 0;
}