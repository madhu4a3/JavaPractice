package geeks;


import java.util.Arrays;
//https://www.geeksforgeeks.org/dsa/meeting-rooms-find-minimum-meeting-rooms/#better-approach-using-sorting-and-two-pointers-onlogn-time-and-o1-space
class MinMeetingRooms {

    // Function to find the minimum number of rooms required
    static int minMeetingRooms(int[] start, int[] end) {
        int n = start.length;

        // no. of rooms at any point of time
        int room = 0;
        int res = 0;

        // sorting the start and end time of meetings
        Arrays.sort(start);
        Arrays.sort(end);

        // pointing to the current index of the start and end array
        int i = 0, j = 0;

        while (i < start.length) {

            // encountered start time of meeting
            if (start[i] < end[j]) {
                // increase no. of rooms
                room++;
                i++;
            }

            // encountered end time of meeting
            else {
                // decrease no. of rooms
                room--;
                j++;
            }

            // updating final result
            res = Math.max(res, room);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] start = {2, 9, 6};
        int[] end = {4, 12, 10};
        System.out.println(minMeetingRooms(start, end));
    }
}