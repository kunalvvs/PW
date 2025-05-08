#include <stdio.h>
struct student {
    char name[50];
    int roll;
    float marks;
} s;

int main() {
    printf("Enter information:\n");
    printf("Enter name: ");
    fgets(s.name, sizeof(s.name), stdin);

    printf("Enter roll number: ");
    scanf("%d", &s.roll);
    printf("Enter marks: ");
    scanf("%f", &s.marks);

    printf("Displaying Information:\n");
    printf("Name: ");
    printf("%s", s.name);
    printf("Roll number: %d\n", s.roll);
    printf("Marks: %.1f\n", s.marks);

    return 0;
}

//write a program of odd num

#include <stdio.h>

int main() {
    int matrix[2][2][2]; // A 3D matrix with dimensions 2x2x2
    int i, j, k;

    // Input elements for the 3D matrix
    printf("Enter elements for a 2x2x2 matrix:\n");
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            for (k = 0; k < 2; k++) {
                printf("Enter element at [%d][%d][%d]: ", i, j, k);
                scanf("%d", &matrix[i][j][k]);
            }
        }
    }

    // Display the 3D matrix
    printf("\nThe 2x2x2 matrix is:\n");
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            for (k = 0; k < 2; k++) {
                printf("%d ", matrix[i][j][k]);
            }
            printf("\n");
        }
        printf("\n");
    }

    return 0;
}

