package m11d01;

class Solution {
    public int solution(int[] cookie) {

        int max = 0;

        for(int i = 0; i < cookie.length - 1; i++){

            int l = i;
            int sumL = cookie[i];

            int m = i+1;
            int sumM = cookie[i+1];

            while (true) {
                if (sumL == sumM){
                    max = Math.max(max, sumL);
                }

                if(sumL <= sumM){
                    l--;
                    if(l < 0 ){
                        break;
                    }
                    sumL = sumL + cookie[l];
                } else {
                    m++;
                    if(m >= cookie.length ){
                        break;
                    }
                    sumM = sumM + cookie[m];
                }
            }
        }
        int answer = max;
        return answer;
    }
}