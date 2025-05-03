#include <stdio.h>
#include <string.h>

struct Car {
    int carID;
    char model[50];
    float rentalRatePerDay;
};

int main() {
    struct Car cars[3];
    int days;
    float totalCost = 0;

    for (int i = 0; i < 3; i++) {
        printf("Enter details for car %d:\n", i + 1);
        printf("Car ID: ");
        scanf("%d", &cars[i].carID);
        printf("Model: ");
        scanf("%s", cars[i].model);
        printf("Rental rate per day: ");
        scanf("%f", &cars[i].rentalRatePerDay);
    }

    printf("\nEnter the number of rental days: ");
    scanf("%d", &days);
    for (int i = 0; i < 3; i++) {
        totalCost += cars[i].rentalRatePerDay * days;
    }

    printf("\nTotal rental cost for %d days: %.2f\n", days, totalCost);

    return 0;
}