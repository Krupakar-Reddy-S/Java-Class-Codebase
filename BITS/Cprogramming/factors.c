#include<stdio.h>

void factors(int n){
    int i = 1;
    printf("The factors of %d are: ", n);

    for(i = 1; i <= n; i++){
        if(n%i == 0){
            if(i == n)
                printf("%d\n", i);
            else
                printf("%d, ", i);
        }
    }
}

int main(){
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    factors(num);
}