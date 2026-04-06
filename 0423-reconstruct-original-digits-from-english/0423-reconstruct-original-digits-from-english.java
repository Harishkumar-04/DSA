class Solution {
    public String originalDigits(String s) {
        int[] freq = new int[26];

        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }

        StringBuilder sb=new StringBuilder();

        while(freq['z'-'a']>0){
            sb.append('0');
            freq['z'-'a']--;
            freq['e'-'a']--;
            freq['r'-'a']--;
            freq['o'-'a']--;
        }

        while(freq['w'-'a']>0){
            sb.append('2');
            freq['t'-'a']--;
            freq['w'-'a']--;
            freq['o'-'a']--;
        }

        while(freq['u'-'a']>0){
            sb.append('4');
            freq['f'-'a']--;
            freq['o'-'a']--;
            freq['u'-'a']--;
            freq['r'-'a']--;
        }

        while(freq['x'-'a']>0){
            sb.append('6');
            freq['s'-'a']--;
            freq['i'-'a']--;
            freq['x'-'a']--;
        }

        while(freq['g'-'a']>0){
            sb.append('8');
            freq['e'-'a']--;
            freq['i'-'a']--;
            freq['g'-'a']--;
            freq['h'-'a']--;
            freq['t'-'a']--;
        }

        while(freq['h'-'a']>0){
            sb.append('3');
            freq['t'-'a']--;
            freq['h'-'a']--;
            freq['r'-'a']--;
            freq['e'-'a']-=2;
        }
        
        while(freq['f'-'a']>0){
            sb.append('5');
            freq['f'-'a']--;
            freq['i'-'a']--;
            freq['v'-'a']--;
            freq['e'-'a']--;
        }

        while(freq['s'-'a']>0){
            sb.append('7');
            freq['s'-'a']--;
            freq['e'-'a']-=2;
            freq['v'-'a']--;
            freq['n'-'a']--;
        }

        while(freq['o'-'a']>0){
            sb.append('1');
            freq['o'-'a']--;
            freq['n'-'a']--;
            freq['e'-'a']--;
        }

        while(freq['i'-'a']>0){
            sb.append('9');
            freq['n'-'a']-=2;
            freq['i'-'a']--;
            freq['e'-'a']--;
        }

        char[] arr=sb.toString().toCharArray();
        Arrays.sort(arr);
        
        return new String(arr);
    }
}