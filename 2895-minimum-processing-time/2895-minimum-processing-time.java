class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks);

        int i=tasks.size()-1,max=0;
        for(int num:processorTime){
            max=Math.max(max,num+tasks.get(i));

            i-=4;
        } 
        return max;     
    }
}
