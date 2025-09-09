package m05d15;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

class Solution {
    public String solution(String s) {

        String[] numbers = s.split(" ");
        int[] intNums = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();

        int[] result = {Math.min(intNums[0], intNums[1]), Math.max(intNums[0], intNums[1])};


        for(int i = 2; i < numbers.length; i++){

            if(result[0] > intNums[i]){
                result[0] = intNums[i];
            }

            if(result[1] < intNums[i]){
                result[1] = intNums[i];
            }

        }

        String answer = result[0] + " " + result[1];
        return answer;


        
    }


}

