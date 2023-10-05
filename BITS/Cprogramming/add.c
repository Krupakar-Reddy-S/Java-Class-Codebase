#include <stdio.h>

int main(){

    int input1;
    int input2;

    printf("Enter two numbers to add: ");
    scanf("%d", &input1);
    scanf("%d", &input2);

    int Sum = input1 + input2;

    printf("The sum of %d + %d = %d.\n",input1, input2, Sum);

    return 0;
}