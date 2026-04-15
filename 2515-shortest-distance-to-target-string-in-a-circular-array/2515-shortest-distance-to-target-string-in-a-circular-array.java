class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        if(words[startIndex].equals(target)) return 0;

        int min=Integer.MAX_VALUE;
        int n=words.length;

        int i = startIndex, steps = 0;
        while(steps < n){
            if(words[i].equals(target)){
                min = Math.min(min, steps);
                break;
            }
            i++;
            if(i == n) i = 0;   
            steps++;
        }

        i = startIndex;
        steps = 0;
        while(steps < n){
            if(words[i].equals(target)){
                min = Math.min(min, steps);
                break;
            }
            i--;
            if(i < 0) i = n - 1; 
            steps++;
        }
        if(min==Integer.MAX_VALUE) return -1;

        return min;
    }
}
