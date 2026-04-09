class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks);

        int i=tasks.size()-1,max1=0,max2=0;
        for(int num:processorTime){
            for(;i>=0;i--){
                max1=Math.max(max1,num+tasks.get(i));
                if((i%4)==0) break;
            }
            i--;
            max2=Math.max(max2,max1);
        } 
        return max2;     
    }
}

// 30 68 112 132 138 166 232 300
// 0  1   2   3   4   5   6  7

