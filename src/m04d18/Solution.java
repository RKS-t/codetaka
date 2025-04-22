package m04d18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {

        List<Integer> currents = new ArrayList<>();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < score.length; i++){

            if(currents.size()<k) {
                currents.add(score[i]);
            } else {
                int min = Collections.min(currents);
                if(min<score[i]){
                    currents.remove(Integer.valueOf(min));
                    currents.add(score[i]);
                }
            }
            results.add(Collections.min(currents));
        }

        int[] answer = results.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}