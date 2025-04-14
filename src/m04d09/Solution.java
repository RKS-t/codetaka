package m04d09;

class Solution {
    public String solution(String s) {

        String[] arr = s.split(" ", -1);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }


        String answer = sb.toString();
        return answer;
    }
}




//-- 코드를 입력하세요
//        SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
//FROM BOOK
//WHERE YEAR(PUBLISHED_DATE) = 2021 AND CATEGORY = '인문'
//ORDER BY PUBLISHED_DATE