package m09d10;


import java.util.HashMap;
import java.util.Map;
class Solution {
    public long[] solution(long k, long[] room_number) {
        Map<Long, Long> parent = new HashMap<>();
        long[] result = new long[room_number.length];

        for (int i = 0; i < room_number.length; i++) {
            long assignedRoom = findRoom(parent, room_number[i]);
            result[i] = assignedRoom;
        }

        return result;
    }

    private long findRoom(Map<Long, Long> parent, long room) {
        if (!parent.containsKey(room)) {
            parent.put(room, room + 1);
            return room;
        }
        long nextRoom = findRoom(parent, parent.get(room));
        parent.put(room, nextRoom);
        return nextRoom;
    }
}

