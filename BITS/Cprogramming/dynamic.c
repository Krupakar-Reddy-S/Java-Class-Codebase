#include <stdio.h>
#include <stdlib.h>
#include <stddef.h>  // Include for size_t

// Define a struct to represent the dynamic array
typedef struct {
    int *array;     // Pointer to the dynamic array
    size_t size;    // Current number of elements in the array
    size_t capacity; // Maximum capacity of the array
} DynamicArray;

// Initialize a new dynamic array with an initial capacity
DynamicArray* initializeDynamicArray(size_t initialCapacity) {
    DynamicArray* dynArr = (DynamicArray*)malloc(sizeof(DynamicArray));
    if (dynArr == NULL) {
        perror("Memory allocation failed");
        exit(1);
    }

    dynArr->array = (int*)malloc(initialCapacity * sizeof(int));
    if (dynArr->array == NULL) {
        perror("Memory allocation failed");
        free(dynArr);
        exit(1);
    }

    dynArr->size = 0;
    dynArr->capacity = initialCapacity;

    return dynArr;
}

// Add an element to the dynamic array
void push(DynamicArray* dynArr, int element) {
    if (dynArr->size == dynArr->capacity) {
        // If the array is full, double its capacity
        dynArr->capacity *= 2;
        dynArr->array = (int*)realloc(dynArr->array, dynArr->capacity * sizeof(int));
        if (dynArr->array == NULL) {
            perror("Memory allocation failed");
            exit(1);
        }
    }

    dynArr->array[dynArr->size] = element;
    dynArr->size++;
}

// Access an element at a given index
int get(DynamicArray* dynArr, size_t index) {
    if (index >= dynArr->size) {
        fprintf(stderr, "Index out of bounds\n");
        exit(1);
    }
    return dynArr->array[index];
}

// Free memory used by the dynamic array
void freeDynamicArray(DynamicArray* dynArr) {
    free(dynArr->array);
    free(dynArr);
}

int main() {
    // Create a new dynamic array with an initial capacity
    DynamicArray* dynArr = initializeDynamicArray(5);

    // Add elements to the dynamic array
    for (int i = 1; i <= 10; i++) {
        push(dynArr, i * 10);
    }

    // Access and print elements
    for (size_t i = 0; i < dynArr->size; i++) {
        printf("Element at index %zu: %d\n", i, get(dynArr, i));
    }

    // Free memory
    freeDynamicArray(dynArr);

    return 0;
}
