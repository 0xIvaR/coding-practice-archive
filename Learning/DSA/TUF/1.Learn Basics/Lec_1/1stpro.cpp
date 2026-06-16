#include <iostream>
using namespace std;
//write a program that takes an input of age
//and prints if you are adult or not
//if age 150+ print invalid age

int main () {
    int age;
    cin >> age;
    
    if (age < 0 || age > 150) {
        cout << "You have entered an invalid age";
    }
    else if (age >= 18) {
        cout << "You are an adult";
    }
    else {
        cout << "You are not an adult";
    }
    return 0;
}
