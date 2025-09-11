package m09d11;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] food_times, long k) {
        long totalTime = 0;
        for (int time : food_times) {
            totalTime += time;
        }
        if (totalTime <= k) return -1;

        PriorityQueue<Food> pq = new PriorityQueue<>((a, b) ->
            Integer.compare(a.time, b.time));

        for (int i = 0; i < food_times.length; i++) {
            pq.offer(new Food(i + 1, food_times[i])); // 1-based index
        }

        long totalEatenTime = 0;
        long previousTime = 0;

        while (!pq.isEmpty()) {
            long currentMinTime = pq.peek().time;
            long timeDiff = currentMinTime - previousTime;
            long roundTime = timeDiff * pq.size();

            if (totalEatenTime + roundTime > k) {
                long remainTime = k - totalEatenTime;
                long remainIndex = remainTime % pq.size();

                List<Food> remainingFoods = new ArrayList<>(pq);
                remainingFoods.sort((a, b) -> Integer.compare(a.index, b.index));

                return remainingFoods.get((int) remainIndex).index;
            }

            totalEatenTime += roundTime;
            previousTime = currentMinTime;

            while (!pq.isEmpty() && pq.peek().time == currentMinTime) {
                pq.poll();
            }
        }

        return -1;
    }

    class Food {
        int index;
        int time;

        Food(int index, int time) {
            this.index = index;
            this.time = time;
        }
    }
}