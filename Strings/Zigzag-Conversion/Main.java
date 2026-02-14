public class Main {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] rows = new StringBuilder[numRows]; 
        for (int row = 0; row < numRows; row++) rows[row] = new StringBuilder();
        int i = 0;
        int j = 0;  
        while(i < s.length()) {
            if (j < numRows) {
                rows[j++].append(s.charAt(i++));
            }
            if (j == numRows) {
                for (int k = j - 2; k > 0 && i < s.length(); k--) {
                    rows[k].append(s.charAt(i++));
                }
                j = 0;
            }
        }
        StringBuilder ans = new StringBuilder("");
        for (StringBuilder row : rows) ans.append(row);
        return ans.toString();
    }
}