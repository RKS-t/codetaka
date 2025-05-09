package m05d09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < privacies.length; i++){
            LocalDate todayL = LocalDate.parse(today, formatter);
            LocalDate start = LocalDate.parse(privacies[i].substring(0, privacies[i].length()-3), formatter);
            int month = (int) ChronoUnit.MONTHS.between(start, todayL);
            int term = 0 ;
            for (String s : terms) {
                if (s.contains(privacies[i].substring(privacies[i].length() - 1))) {
                    term = Integer.parseInt(s.substring(2));
                }
            }

            if((month >= term)){
                result.add(i+1);
            }

        }
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}