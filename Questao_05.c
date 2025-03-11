#include <stdio.h>
#include <stdlib.h> 
#include <time.h> 
#include <math.h>

int main(void) {

    srand(time(NULL));

    int num_gerados = 0; 
    int pri = 0;
    while(pri < 25){
        int aleatorio = rand() % 100 + 1;
        int e_primo = 1;
        for (int z = 2; z <= sqrt(aleatorio); z++) {
            if (aleatorio % z == 0) {
                e_primo = 0;
                break;
            }
        }   
        if (e_primo) {
            pri++;
        }
        num_gerados++;
    }
    printf("Total de numeros gerados: %d\n", num_gerados);
}