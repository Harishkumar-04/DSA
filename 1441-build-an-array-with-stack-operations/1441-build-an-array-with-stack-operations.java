class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();


        int m=1;
        for (int i = 0; i < target.length; i++) {
                if (m == target[i]) {
                    list.add("Push");
                    m++;
                } else {
                    list.add("Push");
                    list.add("Pop");
                    m++;
                    i--;
                }
            }
        return list;
    }
}