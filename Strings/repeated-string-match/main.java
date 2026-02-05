
public class main {

    static int repeatedStringMatch(String a, String b) {
        StringBuilder temp = new StringBuilder(a);
        int cnt = 1;
        if (a.contains(b))
            return 1;
        while (temp.length() < b.length()) {
            temp.append(a);
            cnt++;
            if (temp.toString().contains(b))
                return cnt;
        }
        temp.append(a);
        cnt++;
        if (temp.toString().contains(b))
            return cnt;
        return -1;
    }
    public static void main(String[] args) {
        // Test case 1
        String a1 = "abcd";
        String b1 = "cdabcdab";
        System.out.println("Test 1: a = \"" + a1 + "\", b = \"" + b1 + "\"");
        System.out.println("Result: " + repeatedStringMatch(a1, b1));
        System.out.println();
        
        // Test case 2
        String a2 = "a";
        String b2 = "aa";
        System.out.println("Test 2: a = \"" + a2 + "\", b = \"" + b2 + "\"");
        System.out.println("Result: " + repeatedStringMatch(a2, b2));
        System.out.println();
        
        // Test case 3
        String a3 = "abc";
        String b3 = "wxyz";
        System.out.println("Test 3: a = \"" + a3 + "\", b = \"" + b3 + "\"");
        System.out.println("Result: " + repeatedStringMatch(a3, b3));
    }
}
