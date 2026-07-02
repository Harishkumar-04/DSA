/*
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n=nums.length,count=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(nums[j]);

                if(set.size()==k){
                    count++;
                }
                else if(set.size()>k){
                    break;
                }
            }
        }
        return count;
    }
}
*/

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return check(nums,k)-check(nums,k-1);
    }

    public int check(int[] nums, int k){
        int l=0,r=0,count=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            while(map.size()>k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);

                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }    
}