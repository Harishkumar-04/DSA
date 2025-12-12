/*Brute Force T=O(n^2) S=O(1) 

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxPrd=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int prd=1;
            for(int j=i; j<n; j++){
                prd*=nums[j];
                maxPrd = Math.max(maxPrd,prd);               
            }
        }
        return maxPrd;
    }
}

*/

// Optimal T=O(n) S=O(1)
 
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for(int i=1; i<n; i++){
            int x = nums[i];

            if(x<0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(x,x*max);
            min = Math.min(x,x*min);

            result = Math.max(result,max);
        }
        return result;
    }
}

/*
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for(int i=1; i<n; i++){
            int x = nums[i];


            int tmax = Math.max(x,Math.max(x*max,x*min));
            int tmin = Math.min(x,Math.min(x*max,x*min));

            max = tmax;
            min = tmin;

            result = Math.max(result,max);
        }
        return result;
    }
}
        
*/