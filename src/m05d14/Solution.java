package m05d14;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];  // int 범위를 넘을 수 있으므로 long 사용

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }
}