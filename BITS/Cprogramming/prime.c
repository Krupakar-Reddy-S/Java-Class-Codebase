#include<stdio.h>

int isPrime(int n){
    int count = 0, i = 1;

    for(i = 1; i <= n; i++){
        if(n%i == 0){
            count++;
        }
    }

    if(count == 2){
        return 1;
    }
    else{
        return 0;
    }
}

int main(){
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    if(isPrime(num)){
        printf("The Given number %d, is a Prime number.\n", num);
    }
    else{
        printf("The Given number %d, is not a Prime number.\n", num);
    }

    return 0;
}