#include<stdio.h>

int isArmstrong(int n){
    int Val = 0,N = n;

    while(n > 0){
        int digit = n%10;
        Val += digit * digit * digit;
        n /= 10;
    }

    if(Val == N){
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

    if(isArmstrong(num)){
        printf("The number %d, is an Armstrong number.\n", num);
    }
    else{
        printf("The number %d, is not an Armstrong number!\n", num);
    }
}