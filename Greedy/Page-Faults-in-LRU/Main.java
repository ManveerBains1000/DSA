import java.util.*;
class Main {
    static int pageFaults(int N, int C, int pages[]) {
        // code here
        Set<Integer> st = new HashSet<>();
        Deque<Integer> q = new ArrayDeque<>();
        int pageFaults = 0;
        for (int page : pages) {
            if (!st.contains(page)) {
                if (st.size() == C) {
                    int ele = q.pollFirst();
                    st.remove(ele);
                }
                pageFaults++;
            }
            else {
                q.remove(page);
            }
            
            q.offerLast(page);
            st.add(page);
        }
        return pageFaults;
    }
}