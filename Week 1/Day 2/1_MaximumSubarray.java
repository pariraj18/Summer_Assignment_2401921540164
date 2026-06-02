class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub=Integer.MIN_VALUE;
        int currentsub=0;
        for(int i=0;i<nums.length;i++){
            currentsub+=nums[i];
            if(currentsub>maxSub){
                maxSub=currentsub;
            }
            if(currentsub<0){
                currentsub=0;
            }
        
                }
            return maxSub;
    }
}
