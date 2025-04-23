package m04d23;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < goal.length; i++){
            if(cards1.length > a && cards1[a].equals(goal[i])){
                a += 1;
            } else if(cards2.length > b && cards2[b].equals(goal[i])){
                b += 1;
            } else {
                return "No";
            }
        }

        String answer = "Yes";
        return answer;
    }
}