import java.util.Deque;
import java.util.LinkedList;
public class Main {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        int l = 0;
        int len = 0;
        Deque<Integer> min = new LinkedList<>();
        Deque<Integer> max = new LinkedList<>();
        for (int r = 0; r < n; r++) {
            while(!min.isEmpty() && nums[r] < min.peekLast()) min.pollLast();
            min.addLast(nums[r]);
            while(!max.isEmpty() && nums[r] > max.peekLast()) max.pollLast();
            max.addLast(nums[r]);

            while(max.peekFirst()-min.peekFirst() > limit) {
                if (max.peekFirst() == nums[l]) max.pollFirst();
                if (min.peekFirst() == nums[l]) min.pollFirst();
                l++;
            }
            len = Math.max(len,r-l+1);
        }        
        return len;
    }
}