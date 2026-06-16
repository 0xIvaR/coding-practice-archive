#include <string>
#include <stack>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        
        for (char c : s) {
            // Push opening brackets onto stack
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            // Check closing brackets
            else {
                // If stack is empty, no matching opening bracket
                if (st.empty()) return false;
                
                char top = st.top();
                st.pop();
                
                // Check if closing bracket matches the opening bracket
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // Valid if all brackets are matched (stack is empty)
        return st.empty();
    }
};
