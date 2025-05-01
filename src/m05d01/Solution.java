package m05d01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class Solution {
//    public String solution(String X, String Y) {
//        StringBuilder sb = new StringBuilder();
//        List<Integer> nums = new ArrayList<>();
//
//        for (int i = 0; i < X.length(); i++) {
//            int x = X.charAt(i) - '0';
//
//            for (int j = 0; j < Y.length(); j++) {
//                int y = Y.charAt(j) - '0';
//
//                if (x == y) {
//                    nums.add(y);
//                    // Y에서 해당 문자 제거 (중복 방지)
//                    Y = Y.substring(0, j) + Y.substring(j + 1);
//                    break;
//                }
//            }
//        }
//
//        if (nums.isEmpty()) {
//            return "-1";
//        }
//
//        nums.sort(Comparator.reverseOrder());
//
//        for (int num : nums) {
//            sb.append(num);
//        }
//
//        if (sb.charAt(0) == '0') {
//            return "0";
//        }
//
//        return sb.toString();
//    }
//}

class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        // 각 숫자의 개수 세기
        for (char c : X.toCharArray()) {
            xCount[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            yCount[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        // 9부터 0까지 순회하며 공통 숫자 채우기 (내림차순)
        for (int i = 9; i >= 0; i--) {
            int common = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < common; j++) {
                sb.append(i);
            }
        }

        // 결과가 없으면 -1, 모두 0이면 0
        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}