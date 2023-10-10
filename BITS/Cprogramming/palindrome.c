#include<stdio.h>
#include<string.h>

int isPalindrome(char str[], int size){
    int start = 0;
    int end = size - 1;
    int mid = size / 2;

    for(start = 0; start < mid; start ++){
        if(str[start] != str[end]){
            return 0;
        }
        end--;
    }

    return 1;
}

int main(){
    printf("Enter a String: ");
    char str[100];
    scanf("%s", str);

    if(isPalindrome(str, strlen(str))){
        printf("The given String \"%s\" is a Palindrome.\n", str);
    }
    else{
        printf("The given String \"%s\" is Not a Palindrome!\n", str);
    }

    return 0;
}