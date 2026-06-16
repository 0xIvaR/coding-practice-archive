#include <iostream>
using namespace std;

int main (){
    int age;
    cout << "Job eligibility\nEnter your age: ";
    cin >> age;
    
    if(age < 0 || age > 100){
        cout << "Invalid age";
    }
    else if(age >= 57){
        cout << "retirement time";
    }
    else if(age >= 55){
        cout <<  "eligible for job, but retirement soon.";
    }
    else if(age >= 18){
        cout << "eligible for job";
    }
    else {
        cout << "not eligible for job";
    }
    return 0;
}

// 1. Job Eligibility
// 2. Retirement Age
// 3. Retirement Time
// 4. Job Eligibility with Retirement Time
