package m09d09;

class Solution {
    public int solution(int[] money) {
        int n = money.length;

        if (n == 1) {
            return money[0];
        } else if (n == 2) {
            return Math.max(money[0], money[1]);
        } else if (n == 3) {
            return Math.max(money[0], Math.max(money[1], money[2]));
        } else {
            int[] dp1 = new int[n-1];
            dp1[0] = money[0];
            dp1[1] = Math.max(money[0], money[1]);

            for (int i = 2; i < n-1; i++) {
                dp1[i] = Math.max(
                    dp1[i-1],
                    dp1[i-2] + money[i]
                );
            }

            int[] dp2 = new int[n-1];
            dp2[0] = money[1];
            dp2[1] = Math.max(money[1], money[2]);

            for (int i = 2; i < n-1; i++) {
                dp2[i] = Math.max(
                    dp2[i-1],
                    dp2[i-2] + money[i+1]
                );
            }

            return Math.max(dp1[n-2], dp2[n-2]);
        }
    }
}
