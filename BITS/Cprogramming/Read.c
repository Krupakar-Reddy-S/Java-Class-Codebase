#include <stdio.h>

int main(){
    FILE* fp1 = fopen("data1.txt", "r");
    FILE* fp2 = fopen("data2.txt", "w");

    char line[100];

    while(fgets(line, 100, fp1) != NULL){
        fputs(line, fp2);
    }
}