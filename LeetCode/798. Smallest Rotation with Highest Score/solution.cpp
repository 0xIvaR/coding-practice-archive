#include <vector>
using namespace std;

class Solution {
public:
    int bestRotation(vector<int>& nums) {
        const int n = nums.size();
        vector<int> delta(n, 0);
        
        for (int i = 0; i < n; ++i) {
            int stop = (i - nums[i] + 1 + n) % n;
            --delta[stop];
        }
        
        int score = 0;
        for (int i = 0; i < n; ++i) {
            score += (nums[i] <= i);
        }
        
        int maxScore = score, bestK = 0;
        for (int k = 1; k < n; ++k) {
            ++score;
            score += delta[k];
            if (score > maxScore) {
                maxScore = score;
                bestK = k;
            }
        }
        
        return bestK;
    }
};
