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

/*

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        Map<Integer,Integer> rankMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            rankMap.put(sorted[i], n - i);
        }

        String[] ans = new String[n];

        for(int i = 0; i < n; i++){

            int rank = rankMap.get(score[i]);

            if(rank == 1) ans[i] = "Gold Medal";
            else if(rank == 2) ans[i] = "Silver Medal";
            else if(rank == 3) ans[i] = "Bronze Medal";
            else ans[i] = String.valueOf(rank);
        }

        return ans;
    }
}

-----------------------------------------------------

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        int[] sorted = score.clone();
        Arrays.sort(sorted);

        Map<Integer, String> map = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {

            int rank = n - i;

            if (rank == 1) {
                map.put(sorted[i], "Gold Medal");
            } 
            else if (rank == 2) {
                map.put(sorted[i], "Silver Medal");
            } 
            else if (rank == 3) {
                map.put(sorted[i], "Bronze Medal");
            } 
            else {
                map.put(sorted[i], String.valueOf(rank));
            }
        }

        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            result[i] = map.get(score[i]);
        }

        return result;
    }
}

class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] ans = new String[n];

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);

        for(int i=0;i<n;i++){
            pq.offer(new int[]{score[i],i});
        }

        int rank=1;

        while(!pq.isEmpty()){
            int[] x=pq.poll();
            int idx=x[1];

            if(rank==1){
                ans[idx]="Gold Medal";
            }
            else if(rank==2){
                ans[idx]="Silver Medal";
            }
            else if(rank==3){
                ans[idx]="Bronze Medal";
            }
            else{
                ans[idx]=String.valueOf(rank);
            }
            rank++;
        }
        return ans;
    }
}
*/