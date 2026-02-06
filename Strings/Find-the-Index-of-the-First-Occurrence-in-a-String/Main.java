class Main {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            int j = i;
            int k = 0;
            while(k < n && haystack.charAt(j) == needle.charAt(k)) {
                k++;
                j++;
            }
            if (k == n) return i;
        }
        return -1;
    }
}