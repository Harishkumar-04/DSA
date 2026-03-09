class Solution {
    public int minimumSwap(String s1, String s2) {
        int swap = 0;
        boolean xy = false;
        boolean yx = false;

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if (a == b)
                continue;

            if (a == 'x' && b == 'y') {

                if (xy) {
                    swap++;
                    xy = false;
                } else
                    xy = true;
            }

            else {

                if (yx) {
                    swap++;
                    yx = false;
                } else
                   yx = true;
            }
        }

        if (xy && yx)
            return swap += 2;

        if (xy || yx)
            return -1;

        return swap;
    }

}