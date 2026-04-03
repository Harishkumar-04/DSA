/* 2648 ms

class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int valid=0;
                for(int k=j+1;k<n;k++){
                    if(rating[i]<rating[j] && rating[j]<rating[k])
                    valid++;

                    if(rating[i]>rating[j] && rating[j]>rating[k])
                    valid++;
                }
                count+=valid;
            }
        }
        return count;
    }
}
*/

/* 1332 ms

class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (rating[i] < rating[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if (rating[k] > rating[j]) 
                        count++;
                    }
                } 
                else if (rating[i] > rating[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if (rating[k] < rating[j]) 
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

*/

class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;

        for(int j=0;j<n;j++){
            int leftSmall=0, rightBig=0;
            int leftBig=0, rightSmall=0;

            for(int i=0;i<j;i++){
                if(rating[i]<rating[j]) leftSmall++;
                else if(rating[i]>rating[j]) leftBig++;
            }

            for(int k=j+1;k<n;k++){
                if(rating[k]<rating[j]) rightSmall++;
                else if(rating[k]>rating[j]) rightBig++;
            }
            count+= leftSmall*rightBig;
            count+= leftBig*rightSmall;
        }
        return count;
    }
}

