package geeks;
class GfG {

    static int reverseBits(int n) {
        int ans = 0;

        // traversing bits of 'n' from the right
        while (n > 0) {

            // bitwise left shift
            // 'ans' by 1
            ans <<= 1;
            System.out.println("initially ---"+ans);

            // if current bit is '1'
            if ((n & 1) == 1)
            {
                ans |= 1;
                System.out.println("after ---"+ans);
            }



            // bitwise right shift
            // 'n' by 1
            n >>= 1;
        }

        // required number
        return ans;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(reverseBits(1));
    }
}