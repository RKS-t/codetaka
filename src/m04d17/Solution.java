package m04d17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> current = new ArrayList<>();
        List<Integer> results = new ArrayList<>();
        findSum(numbers, 2, 0, current, results);



        List<Integer> arr = new ArrayList<>(new HashSet<>(results));
        int[] answer = arr.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void findSum(int[] arr, int r, int start, List<Integer> current, List<Integer> results){
        if(current.size() == r){
            results.add(current.stream().mapToInt(Integer::intValue).sum());
            return;
        }

        for(int i = start; i< arr.length; i++){
            current.add(arr[i]);
            findSum(arr, r, i+1, current, results);
            current.remove(current.size()-1);
        }
    }
}
