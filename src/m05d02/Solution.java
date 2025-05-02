package m05d02;

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n];

        Arrays.fill(arr, 1);

        for(int value : lost){
            arr[value-1]-- ;
        }

        for(int value : reserve){
            arr[value-1]++ ;
        }

        if(arr[0] == 0 && arr[1] == 2){
            arr[0] =1;
            arr[1] =1;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (i > 0 && arr[i - 1] == 2) {
                    arr[i]++;
                    arr[i - 1]--;
                } else if (i < n - 1 && arr[i + 1] == 2) {
                    arr[i]++;
                    arr[i + 1]--;
                }
            }
        }

        int answer =(int) Arrays.stream(arr).filter(x -> x > 0).count();
        return answer;
    }
}
//
//
//SELECT *
//FROM PLACES
//WHERE HOST_ID IN (
//        SELECT HOST_ID
//    FROM PLACES
//            GROUP BY HOST_ID
//            HAVING COUNT(*) >= 2
//        )
//ORDER BY ID;