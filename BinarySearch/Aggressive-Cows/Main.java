import java.util.Arrays;
public class Main {
    public boolean canWePlace(int[] stalls,int k,int distance) {
        int count = 1;
        int last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i]-last >= distance) {
                count++;
                last = stalls[i];
                if (count == k) return true;
            }
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1] - stalls[0];
        int ans = 0;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if (canWePlace(stalls,k,mid)) {
                low = mid + 1;
                ans = mid;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}