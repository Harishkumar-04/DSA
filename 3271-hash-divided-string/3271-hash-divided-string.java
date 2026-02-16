class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i += k) {
            StringBuilder sb1 = new StringBuilder();
            sb1.append(s.substring(i, i+k));
            int sum=0;
            for (char ch : sb1.toString().toCharArray()) {
                sum += ch - 'a';
            }
            char mod = (char) ('a' + (sum % 26));
            sb2.append(mod);
        }
        return sb2.toString();
    }
}

/*
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=s.charAt(j)-'a';
            }
            char hashedChar=(char)('a'+(sum%26));
            sb.append(hashedChar);
        }
        return sb.toString();
    }
}
*/

/*
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            StringBuilder sb1=new StringBuilder();
            for(int j=i;j<i+k;j++){
                sb1.append(s.charAt(j));
            }
            int sum=0;
            
            for(char ch:sb1.toString().toCharArray()){
                sum+=ch-'a';
            }
            char mod=(char)('a'+(sum%26));
            sb2.append(mod);
        }
        return sb2.toString();
    }
} 
*/