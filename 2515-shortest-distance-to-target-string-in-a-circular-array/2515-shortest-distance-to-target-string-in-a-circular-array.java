class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        if(words[startIndex].equals(target)) return 0;

        int min=Integer.MAX_VALUE;
        int n=words.length;

        for(int i=startIndex;i<n;i++){
            if(words[i].equals(target)){
                min=Math.min(min,i-startIndex);
                break;
            }
        }

        for(int i = 0; i < startIndex; i++){
            if(words[i].equals(target)){
                min = Math.min(min,(n-startIndex)+i);
                break;
            }
        }

        int i=startIndex-1,steps=1;
        while(i!=startIndex){
            if(i>=0){
                if(words[i].equals(target)){
                    min=Math.min(min,steps);
                    break;
                }
                i--;
                steps++;
            }
            else{
                i=n-1;
            }
        }
        if(min==Integer.MAX_VALUE) return -1;

        return min;
    }
}
