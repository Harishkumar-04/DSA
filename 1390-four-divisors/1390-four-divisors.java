class Solution {
    public int sumFourDivisors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                ans += map.get(num);
            } else {

                count = 0;
                sum = 0;
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        count++;
                        if (count > 4) break;
                        sum += j;
                    }
                }
    
                if (count == 4) {
                    ans += sum;
                    map.put(num, sum);
                }

            }
        
        }
        return ans;
    }
}