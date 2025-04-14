package m04d10;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] number) {

        int answer = find(number, 3, 0, new ArrayList<>());

        return answer;
    }

    public static int find(int[] arr, int r, int start, List<Integer> current){
        if(current.size() == r){
            int sum = current.stream().mapToInt(Integer::intValue).sum();
            if(sum == 0){
                return 1;
            } else {
                return 0;
            }
        }
        int result = 0;
        for (int i = start; i < arr.length; i++){
            current.add(arr[i]);
            result = result + find(arr, r, i+1, current);
            current.remove(current.size()-1);
        }
        return result;
    }



}
//
//
//-- 코드를 입력하세요
//SELECT ROUND(AVG(DAILY_FEE),0) AVERAGE_FEE
//FROM CAR_RENTAL_COMPANY_CAR
//WHERE CAR_TYPE = 'SUV'
//GROUP BY CAR_TYPE