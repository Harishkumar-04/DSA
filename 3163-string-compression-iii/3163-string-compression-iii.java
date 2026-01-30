class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();

        
            char c=word.charAt(0);
            int count=1;

            for(int j=1;j<word.length();j++){
                if(c==word.charAt(j) && count<9){                  
                    count++;                  
                }
                else{
                sb.append(count);
                sb.append(c);
                c=word.charAt(j);
                count=1;
                }   
            }
            sb.append(count);
            sb.append(c);
        return sb.toString();        
    }
}