#include <iostream>
using namespace std;

int main() {
    int grade;
    cout << "Welcome to school grade system\nEnter your grade: ";
    cin >> grade;

    if (grade < 0 || grade > 100) {
        cout << "Invalid grade";
    }
    else if (grade >= 80) {
        cout << "Your grade is A";
    }
    else if (grade >= 60) {
        cout << "Your grade is B";
    }
    else if (grade >= 50) {
        cout << "Your grade is C";
    }
    else if (grade >= 45) {
        cout << "Your grade is D";
    }
    else if (grade >= 25) {
        cout << "Your grade is E";
    }
    else {
        cout << "Your grade is F";
    }

    return 0;
}
