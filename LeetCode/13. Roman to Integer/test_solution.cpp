#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        // Map Roman numerals to their values
        unordered_map<char, int> romanMap = {
            {'I', 1}, {'V', 5}, {'X', 10}, {'L', 50},
            {'C', 100}, {'D', 500}, {'M', 1000}
        };
        
        int result = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            // If current value is less than next value, subtract it (subtraction case)
            if (i < n - 1 && romanMap[s[i]] < romanMap[s[i + 1]]) {
                result -= romanMap[s[i]];
            } else {
                // Otherwise, add it normally
                result += romanMap[s[i]];
            }
        }
        
        return result;
    }
};

int main() {
    Solution solution;
    
    // Test cases
    cout << "Testing Roman to Integer converter:" << endl;
    
    // Test case 1: "III" = 3
    string test1 = "III";
    cout << "romanToInt(\"" << test1 << "\") = " << solution.romanToInt(test1) << endl;
    
    // Test case 2: "LVIII" = 58
    string test2 = "LVIII";
    cout << "romanToInt(\"" << test2 << "\") = " << solution.romanToInt(test2) << endl;
    
    // Test case 3: "MCMXCIV" = 1994
    string test3 = "MCMXCIV";
    cout << "romanToInt(\"" << test3 << "\") = " << solution.romanToInt(test3) << endl;
    
    // Additional test cases
    string test4 = "IV";  // 4
    cout << "romanToInt(\"" << test4 << "\") = " << solution.romanToInt(test4) << endl;
    
    string test5 = "IX";  // 9
    cout << "romanToInt(\"" << test5 << "\") = " << solution.romanToInt(test5) << endl;
    
    string test6 = "XL";  // 40
    cout << "romanToInt(\"" << test6 << "\") = " << solution.romanToInt(test6) << endl;
    
    string test7 = "XC";  // 90
    cout << "romanToInt(\"" << test7 << "\") = " << solution.romanToInt(test7) << endl;
    
    string test8 = "CD";  // 400
    cout << "romanToInt(\"" << test8 << "\") = " << solution.romanToInt(test8) << endl;
    
    string test9 = "CM";  // 900
    cout << "romanToInt(\"" << test9 << "\") = " << solution.romanToInt(test9) << endl;
    
    return 0;
}
