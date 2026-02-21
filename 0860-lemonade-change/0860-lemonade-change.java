class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5 = 0, c10 = 0;
        boolean b = true;
        for (int num : bills) {
            if (num == 5) {
                c5++;
            }

            else if (num == 10 && c5 >= 1) {
                c10++;
                c5--;
            } else if (num == 20) {
                if (c5 >= 1 && c10 >= 1) {
                    c5--;
                    c10--;
                }
                else if(c5>=3)
                c5-=3;
                else b=false;
            } else
                b = false;
        }
        return b;
    }
}