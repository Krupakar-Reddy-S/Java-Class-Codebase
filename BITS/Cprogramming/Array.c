#include<stdio.h>

int max(int* A, int n){
    int max = *A, i = 0;
    for(i = 0; i < n; i++){
        if(*(A+i) > max){
            max = *(A+i);
        }
    }

    return max;
}

int min(int* A, int n){
    int min = *A, i = 0;
    for(i = 0; i < n; i++){
        if(*(A+i) < min){
            min = *(A+i);
        }
    }

    return min;
}

int search(int* A, int n, int val){
    int i = 0;
    for(i = 0; i < n; i++){
        if(*(A+i) == val){
            return i;
        }
    }
}

int frequency(int* A, int n, int val){
    int i = 0, count = 0;
    for(i = 0; i < n; i++){
        if(*(A+i) == val){
            count++;
        }
    }

    return count;
}

int main(){
    int arr[] = {1, 2, 3, 4, 5, 7, 6, 7, 8, 9};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("Maximum value in Array is: %d\n", max(arr, n));
    printf("Minimum value in Array is: %d\n", min(arr, n));
    printf("Index of val in Array is: %d\n", search(arr, n, 5));
    printf("Frequency of given val in Array is: %d\n", frequency(arr, n, 7));

    return 0;
}