#include <vector>
using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        // Edge case: empty array
        if (nums.empty()) return 0;
        
        // Two-pointer approach
        int writeIndex = 1; // Position to write next unique element
        
        for (int readIndex = 1; readIndex < nums.size(); readIndex++) {
            // If current element is different from previous, it's unique
            if (nums[readIndex] != nums[readIndex - 1]) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        
        return writeIndex; // Number of unique elements
    }
};
