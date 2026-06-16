#include <vector>
#include <algorithm>
#include <climits>

class Solution {
public:
    double findMedianSortedArrays(std::vector<int>& nums1, std::vector<int>& nums2) {
        // For optimal performance, perform binary search on the smaller array.
        if (nums1.size() > nums2.size()) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.size();
        int y = nums2.size();
        int low = 0;
        int high = x;

        while (low <= high) {
            // partitionX is the number of elements taken from nums1 for the left half.
            int partitionX = (low + high) / 2;
            // partitionY is calculated to ensure the total number of elements in the
            // combined left half is (x + y + 1) / 2.
            int partitionY = (x + y + 1) / 2 - partitionX;

            // Get the boundary elements for the partitions.
            // maxLeftX is the largest element in the left partition of nums1.
            int maxLeftX = (partitionX == 0) ? INT_MIN : nums1[partitionX - 1];
            // minRightX is the smallest element in the right partition of nums1.
            int minRightX = (partitionX == x) ? INT_MAX : nums1[partitionX];

            // maxLeftY is the largest element in the left partition of nums2.
            int maxLeftY = (partitionY == 0) ? INT_MIN : nums2[partitionY - 1];
            // minRightY is the smallest element in the right partition of nums2.
            int minRightY = (partitionY == y) ? INT_MAX : nums2[partitionY];

            // Check if we have found the correct partition.
            // The condition is that the max of the left half is less than or equal to the min of the right half.
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // Correct partition found, now calculate the median.
                if ((x + y) % 2 == 0) {
                    // If the total number of elements is even, the median is the average of the
                    // two middle elements.
                    return (std::max(maxLeftX, maxLeftY) + std::min(minRightX, minRightY)) / 2.0;
                } else {
                    // If the total number of elements is odd, the median is the single middle element.
                    return std::max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                // The partition in nums1 is too large. Move to the left in nums1.
                high = partitionX - 1;
            } else {
                // The partition in nums1 is too small. Move to the right in nums1.
                low = partitionX + 1;
            }
        }

        // This part should not be reached if the inputs are sorted arrays.
        // It's here to handle potential compiler warnings.
        return 0.0;
    }
};
