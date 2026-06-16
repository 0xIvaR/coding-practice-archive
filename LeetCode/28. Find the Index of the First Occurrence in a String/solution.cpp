#include <string>
using namespace std;

class Solution {
public:
    int strStr(string haystack, string needle) {
        // Edge case: empty needle
        if (needle.empty()) return 0;
        
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        
        // If needle is longer than haystack, no match possible
        if (needleLen > haystackLen) return -1;
        
        // Check each possible starting position
        for (int i = 0; i <= haystackLen - needleLen; i++) {
            // Check if needle matches at position i
            if (haystack.substr(i, needleLen) == needle) {
                return i;
            }
        }
        
        return -1; // No match found
    }
};
