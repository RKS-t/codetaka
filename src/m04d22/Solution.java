package m04d22;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public String solution(int a, int b) {

        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        LocalDate start = LocalDate.of(2016, 1, 1);
        LocalDate end = LocalDate.of(2016, a, b);

        int days =(int) ChronoUnit.DAYS.between(start, end);

        String answer = week[((days + 4) % 7)];
        return answer;
    }
}