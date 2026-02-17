public class Main {
    public int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }
    public boolean canWePlace(int[] arr,int k,int minTime) {
        int time = 0;
        int workers = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]+time <= minTime) {
                time += arr[i];
            }
            else {
                time = arr[i];
                workers++;
                if (workers > k) return false;
            }
        }
        return true;
    }
    public int max(int[] arr) {
        int max = 0;
        for (int num : arr) max = Math.max(max,num);
        return max;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int low =  max(arr);
        int high = sum(arr);
        int ans = 0;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if (canWePlace(arr,k,mid)) {
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
