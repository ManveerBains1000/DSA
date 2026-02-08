public class Main {
    public void findLps(String s, int[] lps) {
        int len = 0;
        int i = 1;
        int n = s.length();
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public String shortestPalindrome(String s) {
        int n = s.length();
        StringBuilder rev = new StringBuilder("");
        for (int i = n - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        String mergeStr = s + "-" + rev.toString();
        int m = mergeStr.length();
        int[] lps = new int[m];
        findLps(mergeStr, lps);
        return rev.substring(0, n - lps[m - 1]) + s;
    }

}
