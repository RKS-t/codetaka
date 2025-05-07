package m05d07;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {

        Map<String, Integer> result = new HashMap<>(Map.of("R", 0, "T", 0, "C", 0, "F", 0, "J", 0, "M", 0, "A", 0, "N", 0));
        StringBuilder sb = new StringBuilder();


        for(int i = 0 ; i < survey.length ; i++){

            if(choices[i] < 4){
                String cha = String.valueOf(survey[i].charAt(0));
                result.replace(cha, result.get(cha)+4-choices[i]);
            }

            if(choices[i] > 4) {
                String cha = String.valueOf(survey[i].charAt(1));
                result.replace(cha, result.get(cha)-4+choices[i]);
            }
        }

        if(result.get("R") >= result.get("T")){
            sb.append("R");
        } else {
            sb.append("T");
        }

        if(result.get("C") >= result.get("F")){
            sb.append("C");
        } else {
            sb.append("F");
        }

        if(result.get("J") >= result.get("M")){
            sb.append("J");
        } else {
            sb.append("M");
        }

        if(result.get("A") >= result.get("N")){
            sb.append("A");
        } else {
            sb.append("N");
        }

        String answer = sb.toString();
        return answer;
    }
}