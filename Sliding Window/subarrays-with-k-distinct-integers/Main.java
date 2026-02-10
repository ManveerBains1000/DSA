import java.util.*;
class Main {
    public int helper(int[] nums,int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int l = 0;
        int cnt = 0;
        for (int r = 0; r < nums.length; r++) {
            if (!mp.containsKey(nums[r])) {
                mp.put(nums[r],1);
            }
            else {
                mp.put(nums[r],mp.get(nums[r])+1);
            }
            while(mp.size() > k && l < nums.length) {
                mp.put(nums[l],mp.get(nums[l])-1);
                if (mp.get(nums[l]) == 0) {
                    mp.remove(nums[l]);
                }
                l++;
            }
            if (mp.size() <= k){
                cnt += r-l+1;
            }
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
}