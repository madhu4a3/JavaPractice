package geeks;

//https://www.geeksforgeeks.org/dsa/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/#expected-approach-by-using-hashing-and-two-pointerson-time-and-o1-space
class MinWindowSubString {
    public static String smallestWindow(String s, String p) {
        int len1 = s.length();
        int len2 = p.length();

        if (len1 < len2)
            return "-1";

        int[] countP = new int[256];
        int[] countS = new int[256];

        // Store occurrence of characters of P
        for (int i = 0; i < len2; i++)
            countP[p.charAt(i)]++;

        int start = 0, start_idx = -1, min_len = Integer.MAX_VALUE;
        int count = 0;

        for (int j = 0; j < len1; j++) {
            char currChar = s.charAt(j);

            // Count occurrence of characters of string S
            countS[currChar]++;

            // If S's char matches with P's char, increment count
            if (countP[currChar] > 0 && countS[currChar] <= countP[currChar]) {
                count++;
            }

            // If all characters are matched
            if (count == len2) {

                // Try to minimize the window
                char startChar;
                while (countS[startChar = s.charAt(start)] > countP[startChar] || countP[startChar] == 0) {
                    if (countS[startChar] > countP[startChar]) {
                        countS[startChar]--;
                    }
                    start++;
                }

                // Update window size
                int len = j - start + 1;
                if (min_len > len) {
                    min_len = len;
                    start_idx = start;
                }
            }
        }

        if (start_idx == -1)
            return "";

        return s.substring(start_idx, start_idx + min_len);
    }

    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";

        String res = smallestWindow(s, p);
        System.out.println(res);
    }
}