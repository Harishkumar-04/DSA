/*class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int n = nums.length, count = 0;
        Set<Integer> cmplt = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                cmplt.add(nums[j]);
                if (cmplt.size() == set.size()) {
                    count += (n - j);
                    break;
                }
            }
            cmplt.clear();
        }
        return count;
    }
}
*/

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int l=0,n=nums.length,count=0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int r=0;r<n;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            while(set.size()==map.size()){
                count+=(n-r);

                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                map.remove(nums[l]);
                }
                l++;
            }
        }
        return count;
    }
}

