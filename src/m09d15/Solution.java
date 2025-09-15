package m09d15;

class Solution {
    public int solution(int n) {

        if (n <= 1) return 1;

        int[] catalan = new int[n + 1];
        catalan[0] = catalan[1] = 1;

        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - 1 - j];
            }
        }

        return catalan[n];
    }
}