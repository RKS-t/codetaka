package m05d08;

public class Solution {
    public int[] solution(String[] wallpaper) {

        int[] answer = {wallpaper.length, wallpaper[0].length(), 0, 0};

        for(int i = 0; i < wallpaper.length; i++){

            if(wallpaper[i].contains("#")){
                int sx = wallpaper[i].indexOf("#");
                int lx = wallpaper[i].lastIndexOf("#");

                if(i < answer[0]){
                    answer[0] = i;
                }

                if(sx < answer[1]){
                    answer[1] = sx;
                }

                if(i > answer[2]){
                    answer[2] = i + 1;
                }

                if(lx > answer[3]){
                    answer[3] = lx + 1;
                }
            }
        }

        return answer;
    }
}
