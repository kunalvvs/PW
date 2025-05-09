#include <iostream>
using namespace std;

int main() {
    try {
        int numerator = 10;
        int denominator = 0;

        if (denominator == 0) {
            throw runtime_error("Division by zero error");
        }

        int result = numerator / denominator;
        cout << "Result: " << result << endl;
    } catch (const runtime_error& e) {
        cout << "Exception caught: " << e.what() << endl;
    } catch (...) {
        cout << "An unknown exception occurred." << endl;
    }

    return 0;
}