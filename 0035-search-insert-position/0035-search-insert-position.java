class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // Avoids potential integer overflow vs (start + end) / 2
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Found target, return index
            } else if (nums[mid] < target) {
                start = mid + 1; // Target is in the right half
            } else {
                end = mid - 1;   // Target is in the left half
            }
        }

        // If not found, 'start' will land exactly on the insertion index
        return start;
    }
}