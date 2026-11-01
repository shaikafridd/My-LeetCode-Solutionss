class Solution {
    public int minMoves(int[] nums) {
         int min = nums[0];
         int i;

         for(i=1; i<nums.length; i++){
            if (min > nums[i]){
                min = nums[i];
            }
         }
        

            int moves = 0;
            for(i=0; i<nums.length; i++){
                moves = moves + (nums[i]- min);
            }
    
            return moves;
         
    }
}