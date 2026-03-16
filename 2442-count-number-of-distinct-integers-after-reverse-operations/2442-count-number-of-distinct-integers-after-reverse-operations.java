class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int[] arr = new int[n * 2];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int num = nums[i];
            while (num > 0) {
                int rem = num % 10;
                sb.append(rem);
                num /= 10;
            }
            arr[i] = nums[i];
            arr[i + n] = Integer.parseInt(sb.toString());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int num : arr) {
            set.add(num);
        }

        return set.size();

    }
}