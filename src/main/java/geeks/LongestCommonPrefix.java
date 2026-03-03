package geeks;
//https://www.geeksforgeeks.org/dsa/longest-common-prefix-using-binary-search/

class LongestCommonPrefix {

    // Function to check if the substring between the
    // indexes[left ... right] was common among all strings or not
    static boolean allContainSubstring(String[] arr, int left,
                                       int right) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = left; j <= right; j++) {
                if (arr[i].charAt(j) != arr[0].charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // A Function that returns the longest common prefix
    // from the array of strings
    static String longestCommonPrefix(String []arr) {
        int minLen = arr[0].length();

        // Find length of shortest string
        for (String str : arr) {
            minLen = Math.min(minLen, str.length());
        }

        // We will do an in-place binary search on the indices
        // to find the length of longest common prefix
        int lo = 0, hi = minLen - 1;
        int prefixLen = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (allContainSubstring(arr, lo, mid)) {
                // If all the strings in the input array
                // contain common prefix till mid index
                // then update prefixLen with mid + 1
                prefixLen = mid + 1;

                // And then check in the right part
                lo = mid + 1;
            }
            else {

                // Otherwise check in the left part
                hi = mid - 1;
            }
        }

        // Return the common prefix by taking
        // substring from the first string
        return arr[0].substring(0, prefixLen);
    }

    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek",
                "geezer"};
        System.out.println(longestCommonPrefix(arr));
    }
}