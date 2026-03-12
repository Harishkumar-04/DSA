/*class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] copy = Arrays.copyOf(score, n);
        Arrays.sort(score);

        int gold = 0, silver = 0, bronze = 0;
        String[] arr = new String[n];

        if(n<2){
            arr[0]="Gold Medal";
            return arr;
        }

        else if (n >= 3) {
            gold = score[n - 1];
            silver = score[n - 2];
            bronze = score[n - 3];

            for (int i = 0; i < n; i++) {
                if (copy[i] == gold) {
                    arr[i] = "Gold Medal";
                } else if (copy[i] == silver) {
                    arr[i] = "Silver Medal";
                } else if (copy[i] == bronze) {
                    arr[i] = "Bronze Medal";
                } else {
                    for (int j = 0; j < n - 3; j++) {
                        if (score[j] == copy[i]) {
                            arr[i] = String.valueOf(n - j);
                        }
                    }
                }
            }
            return arr;
        } else {
            gold = score[n - 1];
            silver = score[n - 2];

            for (int i = 0; i < n; i++) {
                if (copy[i] == gold) {
                    arr[i] = "Gold Medal";
                } else if (copy[i] == silver) {
                    arr[i] = "Silver Medal";
                }
            }
            return arr;
        }

    }
}
*/

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res=new String[n];
        Integer[] index=new Integer[n];

        for(int i=0;i<n;i++){
            index[i]=i;
        }
        Arrays.sort(index,(a,b) -> score[b]-score[a]);

        for(int i=0;i<n;i++){
            if(i==0){
                res[index[i]] = "Gold Medal";
            }
            else if(i==1){
                res[index[i]] = "Silver Medal";
            }
            else if(i==2){
                res[index[i]] = "Bronze Medal";
            }
            else{
                res[index[i]] = String.valueOf(i+1);
            }
        }
        return res;
    }
}
        