#include<stdio.h>

typedef struct{
    int RollNo;
    char Name[20];
    float CGR;
}Student;

int main(){
    Student s1 = {10086, "Krupakar", 78.8};
    printf("%lu, %lu, %lu \n", sizeof(s1.RollNo), sizeof(s1.Name), sizeof(s1.CGR));
}