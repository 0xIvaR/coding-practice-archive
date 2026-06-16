#include <vector>
#include <string>
#include <algorithm>

class Solution {
public:
    std::vector<std::string> removeSubfolders(std::vector<std::string>& folder) {
        // Sort the folder paths lexicographically. This is the key step.
        // After sorting, a sub-folder will always appear immediately after its parent folder.
        // For example, "/a" will come before "/a/b".
        std::sort(folder.begin(), folder.end());

        std::vector<std::string> result;
        if (folder.empty()) {
            return result;
        }

        // The first folder is always a root folder in the sorted list.
        result.push_back(folder[0]);

        // Iterate through the rest of the folders.
        for (size_t i = 1; i < folder.size(); ++i) {
            // Get the last added root folder.
            const std::string& last_root = result.back();
            
            // Check if the current folder is a sub-folder of the last root.
            // A sub-folder must start with the root path, followed by a '/'.
            // The `find` method returns 0 if the substring starts at the beginning.
            // We also check for the '/' to ensure it's a true sub-folder (e.g., "/a/b" vs "/ab").
            if (folder[i].find(last_root) == 0 && folder[i][last_root.length()] == '/') {
                // It's a sub-folder, so we skip it.
                continue;
            } else {
                // It's not a sub-folder, so it's a new root.
                result.push_back(folder[i]);
            }
        }

        return result;
    }
};
