/* Brute Force

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;

        for(int i=0;i<s.length();i++){
            boolean[] seen=new boolean[256];
            //int count=0;

            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);

                if(seen[c])
                break;

                seen[c]=true;    
                //count++; 
                max=Math.max(max,j-i+1);
            }
            //max=Math.max(max,count);
        }
        return max;
    }
}
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}


// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int[] last=new int[256];
//         Arrays.fill(last,-1);
//         int left=0, max=0;

//         for(int right=0;right<s.length();right++){
//             char c=s.charAt(right);

//             while(last[c]>=left)
//             left=last[c]+1;

//             last[c]=right;
//             max=Math.max(max,right-left+1);
//         }
//         return max;
//     }
// }