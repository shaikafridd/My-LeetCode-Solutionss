class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: if the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }
        
        // 'insertIndex' tracks the position for the next unique element
        int insertIndex = 1; 
        
        for (int j = 1; j < nums.length; j++) {
            // If we find a unique element (different from the previous one)
            if (nums[j] != nums[j - 1]) {
                nums[insertIndex] = nums[j]; // Move it to the unique zone
                insertIndex++; // Move the pointer forward
            }
        }
        
        // Return the number of unique elements
        return insertIndex;
    }
}