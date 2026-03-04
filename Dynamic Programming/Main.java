class Main {
    public boolean helper(int[] nums,int i,int sum,Boolean[][] dp) {
        if (i == 0) {
            if (sum == nums[i] || sum == 0) return true;
            else return false;
        }
        if (dp[i][sum] != null) return dp[i][sum];
        boolean notTake = helper(nums,i-1,sum,dp);
        boolean take = false;
        if (sum >= nums[i]) {
            take = helper(nums,i-1,sum-nums[i],dp);
        }
        return dp[i][sum] = notTake || take;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        if (sum % 2 != 0) return false;

        Boolean[][] dp = new Boolean[nums.length][sum+1];
        return helper(nums,nums.length-1,sum/2,dp);   
    }
}

