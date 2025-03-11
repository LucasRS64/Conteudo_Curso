#include <stdio.h>

int main() {
    int primeiro_numero = 220;
    int segundo_numero = 254;

    int soma_div_priNum = 0;
    int soma_div_segNum = 0;

    for (int i = 1; i <= primeiro_numero/2;i++) {
       if (primeiro_numero % i == 0) {
         soma_div_priNum += i;
       }
    }
    for (int y = 1; y <= segundo_numero/2;y++) {
        if (segundo_numero % y == 0) {
            soma_div_segNum += y;
        }
    }

    if (soma_div_priNum == segundo_numero && soma_div_segNum == primeiro_numero) {
        printf("Os numeros sao amigos. =)\n");
    } else {
        printf("os numeros nao sao amigos. ;-;\n");
    }
}