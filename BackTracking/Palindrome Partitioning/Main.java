import java.util.*;
class Main {
    public boolean isPalindrome(String s,int i,int j) {
        while(i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
    public void helper(String s,int i,List<List<String>> ans,List<String> ds) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(s,i,j)) {
                ds.add(s.substring(i,j+1));
                helper(s,j+1,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s,0,ans,new ArrayList<>());
        return ans;
    }
}