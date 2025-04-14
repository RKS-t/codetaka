package m04d14;

class Solution {
    public int solution(String s) {
        String[] words = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        for (int i = 0; i < words.length; i++) {
            s = s.replaceAll(words[i], Integer.toString(i));
        }

        int answer = Integer.parseInt(s);
        return answer;
    }
}



//
//-- 코드를 입력하세요
//SELECT DISTINCT A.CAR_ID
//FROM CAR_RENTAL_COMPANY_CAR A INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B ON A.CAR_ID = B.CAR_ID
//WHERE A.CAR_TYPE = '세단' AND MONTH(B.START_DATE) = 10
//GROUP BY CAR_ID
//ORDER BY CAR_ID DESC
