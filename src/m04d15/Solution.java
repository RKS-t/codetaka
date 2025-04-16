package m04d15;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {

        String[] str = new String[strings.length];

        for (int i =0; i < strings.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(strings[i].charAt(n));
            for(int j =0; j < strings[i].length() ; j++){
                sb.append(strings[i].charAt(j));
            }
            str[i] = sb.toString();
        }
        String[] answer = Arrays.stream(str).sorted()
                .map(s -> s.substring(1))
                .toArray(String[]::new);
        return answer;
    }
}

//class Solution {
//    public String[] solution(String[] strings, int n) {
//        return Arrays.stream(strings)
//                .map(s -> s.charAt(n) + s)       // n번째 문자 + 원래 문자열
//                .sorted()                        // 정렬
//                .map(s -> s.substring(1))        // 앞의 n번째 문자 제거
//                .toArray(String[]::new);         // 배열로 반환
//    }
//}


//
//class Solution {
//    public String[] solution(String[] strings, int n) {
//        Arrays.sort(strings, (s1, s2) -> {
//            if (s1.charAt(n) == s2.charAt(n)) {
//                return s1.compareTo(s2); // 사전순
//            }
//            return Character.compare(s1.charAt(n), s2.charAt(n));
//        });
//        return strings;
//    }
//}
