package m04d11;

class Solution {
    public int solution(String t, String p) {
        int[] arrt = t.chars().map(c -> c - '0').toArray();
        int[] arrp = p.chars().map(c -> c - '0').toArray();

        int answer = 0;

        for(int i = 0; i <= arrt.length - p.length(); i++){

            boolean isLess = false;
            boolean isEqual = true;

            for(int j = 0; j < p.length(); j++){
                if(arrt[j+i] < arrp[j]){
                    isLess = true;
                    break;
                } else if (arrt[j+i] > arrp[j]){
                    isEqual = false;
                    break;
                }
            }
            if (isLess || isEqual) {
                answer++;
            }
        }


        return answer;
    }
}
