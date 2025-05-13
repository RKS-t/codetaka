package m05d13;

class Solution {
    int minA = Integer.MAX_VALUE;
    int n, m;
    int[][] info;

    public int solution(int[][] info, int n, int m) {
        this.n = n;
        this.m = m;
        this.info = info;

        dfs(0, 0, 0);
        return minA == Integer.MAX_VALUE ? -1 : minA;
    }

    public void dfs(int index, int aSum, int bSum) {
        if (aSum >= n || bSum >= m) return;

        if (index == info.length) {
            minA = Math.min(minA, aSum);
            return;
        }

        dfs(index + 1, aSum + info[index][0], bSum);

        dfs(index + 1, aSum, bSum + info[index][1]);
    }
}

