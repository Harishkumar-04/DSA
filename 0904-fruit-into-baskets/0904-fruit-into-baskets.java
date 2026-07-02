/*
class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxlen=0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                set.add(fruits[j]);

                if (set.size() <= 2) {
                    maxlen = Math.max(maxlen, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxlen;
    }
}
*/

class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxlen=0;
        int l=0,r=0;maxlen=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

            if(map.size()>2){
                while(map.size()>2){
                    map.put(fruits[l],map.get(fruits[l])-1);

                    if(map.get(fruits[l])==0){
                        map.remove(fruits[l]);
                    }
                    l++;
                }
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}