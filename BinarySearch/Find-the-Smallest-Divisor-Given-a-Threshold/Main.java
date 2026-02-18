public class Main {
    public int max(int[] nums) {
        int maxi = 0;
        for (int num : nums) maxi=Math.max(maxi,num);
        return maxi;
    }
    public boolean sumOfDivision(int[] nums,int k,int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double)num/(double)k);
        }
        return sum <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = max(nums);
        int ans = 0;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if (sumOfDivision(nums,mid,threshold)) {
                high = mid - 1;
                ans = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}