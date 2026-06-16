#include <vector>
#include <unordered_map>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::unordered_map<int, int> m;
        
        for (int i = 0; i != nums.size(); ++i) {
            auto it = m.find(target - nums[i]);
            if (it != m.end()) 
                return {it->second, i};
            m[nums[i]] = i;
        }
        
        return {};
    }
}; 