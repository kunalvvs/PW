package Practice.TCS.Advance;
import java.util.*;
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0;
        int rsum = 0;
        int maxi = 0;

        for(int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }

        maxi = lsum;
        int rptr = n - 1;

        for(int i = k - 1; i >= 0; i--) {
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rptr];
            rptr--;
            maxi = Math.max(maxi, lsum + rsum);
        }

        return maxi;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] cardPoints = {1, 2, 3, 4, 5 , 6, 7};
            int k = 3;
            System.out.println(s.maxScore(cardPoints, k));

    }
}
