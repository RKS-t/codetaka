package m04d30;

class Solution {
    public int solution(String[] babbling) {
        String[] valid = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String word : babbling) {
            String prev = "";
            int i = 0;

            while (i < word.length()) {
                boolean matched = false;
                for (String v : valid) {
                    if (word.startsWith(v, i) && !v.equals(prev)) {
                        prev = v;
                        i += v.length();
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    break;
                }
            }

            if (i == word.length()) {
                count++;
            }
        }

        int answer = count;
        return answer;
    }
}
