package m04d08;

public class Solution {
    public int solution(int n) {

        StringBuilder sb= new StringBuilder();

        String n3 = Integer.toString(n, 3);
        int[] arr = n3.chars().map(c-> c - '0').toArray();
        int[] arr2 = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            sb.append(arr[arr.length-i-1]);
        }

        int answer = Integer.parseInt(sb.toString(), 3);
        return answer;
    }
}


/* SQL
-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME = 'Lucy' OR
    NAME ='Ella' OR
    NAME ='Pickle' OR
    NAME ='Rogan' OR
    NAME ='Sabrina' OR
    NAME ='Mitty'
ORDER BY ANIMAL_ID
*/