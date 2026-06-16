#include <vector>
using namespace std;

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int writeIndex = 0; // Position to write next valid element
        
        for (int readIndex = 0; readIndex < nums.size(); readIndex++) {
            // If current element is not equal to val, keep it
            if (nums[readIndex] != val) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        
        return writeIndex; // Number of elements not equal to val
    }
};
