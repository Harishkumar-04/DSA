class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String match="";

            for(int i=0;i<strs[0].length();i++){
                char ch = strs[0].charAt(i);

                for(int j=1;j<strs.length;j++){

                    if(i>=strs[j].length() || ch !=strs[j].charAt(i)) return match;
                }
                match+=ch;
        }
        return match; 
    }
}
// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if(strs.length== 1) return strs[0];
//         StringBuilder match = new StringBuilder();

//             for(int i=0;i<strs[0].length();i++){
//                 char ch = strs[0].charAt(i);
//                 boolean flag = false;
//                 for(int j=1;j<strs.length;j++){
//                     if(i<strs[j].length() && ch == strs[j].charAt(i)){
//                         flag = true;
//                         continue;
//                     }
//                     else flag = false;
                        
//                 }
                
//                 if(flag) match.append(ch); 
//             }
        
//         return match.toString(); 
//     }
// }