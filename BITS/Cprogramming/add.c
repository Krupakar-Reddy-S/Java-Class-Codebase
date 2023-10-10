#include <stdio.h>

int main(){

    int input1, input2;

    printf("Enter two numbers to add: ");
    scanf("%d %d", &input1, &input2);

    int Sum = input1 + input2;

    printf("The sum of %d + %d = %d.\n",input1, input2, Sum);

    return 0;
}