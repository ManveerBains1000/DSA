import java.util.List;
import java.util.ArrayList;
class Main {
    public void helper(int num,List<Integer> arr) {
        List<Integer> temp = new ArrayList<>();
        while(num != 0) {
            int d = num % 10;
            temp.add(d);
            num /= 10;
        }
        for (int i = temp.size()-1; i>=0; i--) arr.add(temp.get(i));
    } 
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        for (int num : nums) helper(num,temp);

        int[] res = new int[temp.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = temp.get(i);
        }
        return res;
    }
}