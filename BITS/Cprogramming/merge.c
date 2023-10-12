#include <stdio.h>
#include <stdlib.h>

void merge(int A1[], int n1, int A2[], int n2, int* A3, int n3) {
    int i = 0, j = 0, k = 0;

    while (i < n1 && j < n2) {
        if (A1[i] < A2[j]) {
            A3[k] = A1[i];
            i++;
        } else {
            A3[k] = A2[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        A3[k] = A1[i];
        i++;
        k++;
    }

    while (j < n2) {
        A3[k] = A2[j];
        j++;
        k++;
    }
}

int main() {
    int A1[] = {1, 2, 3, 5, 6, 7, 9};
    int n1 = sizeof(A1) / sizeof(A1[0]);

    int A2[] = {4, 6, 8, 10, 11};
    int n2 = sizeof(A2) / sizeof(A2[0]);

    int n3 = n1 + n2;
    int* A3 = (int*)malloc(n3 * sizeof(int));

    if (A3 == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }

    merge(A1, n1, A2, n2, A3, n3);

    printf("Merged two Sorted Arrays: \n");

    for (int i = 0; i < n3; i++) {
        printf("%d ", A3[i]);
    }

    printf("\n");
    free(A3);

    return 0;
}
