package m04d16;

import java.awt.*;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int[] com = commands[i];
            List<Integer> list = new ArrayList<>();
            for(int j = com[0]-1; j < com[1]; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(com[2]-1);
        }
        return answer;
    }
}

//
//SELECT R.FOOD_TYPE, R.REST_ID, R.REST_NAME, R.FAVORITES
//FROM REST_INFO R
//JOIN (
//                SELECT FOOD_TYPE, MAX(FAVORITES) AS MAX_FAV
//FROM REST_INFO
//GROUP BY FOOD_TYPE
//) M ON R.FOOD_TYPE = M.FOOD_TYPE AND R.FAVORITES = M.MAX_FAV
//ORDER BY R.FOOD_TYPE DESC;
