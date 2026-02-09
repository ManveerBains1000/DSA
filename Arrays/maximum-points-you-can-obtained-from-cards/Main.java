class Main {
    public int maxScore(int[] cardPoints, int k) {
        int maxScore = 0;
        int score = 0;
        int l = 0, r = cardPoints.length-1;
        while(l < k) {
            score += cardPoints[l++];
        }
        maxScore = score;
        l = l-1;
        while(l >= 0) {
            score -= cardPoints[l--];
            score += cardPoints[r--];
            maxScore = Math.max(score,maxScore);
        }
        return maxScore;
    }
}