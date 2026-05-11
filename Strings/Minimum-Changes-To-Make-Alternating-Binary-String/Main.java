class Main {
    public int minOperations(String s) {
        int count1 = 0; // 0101
        int count2 = 0; // 1010

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i % 2 == 0) {
                if (ch != '0') count1++;
            }
            else {
                if (ch != '1') count1++;
            }
            if (i % 2 == 0) {
                if (ch != '1') count2++;
            }
            else {
                if (ch != '0') count2++;
            }
        }
        return Math.min(count1,count2);
    }
}

