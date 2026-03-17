class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[queries.length];

        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                map.put(j,i);
                j++;
            }           
        }
        //[0,2]
        for(int k=0;k<queries.length;k++){
            if(map.containsKey(queries[k])){
            arr[k]=map.get(queries[k]);
            }
            else
            arr[k]=-1;
        }
        return arr;
                
    }
}