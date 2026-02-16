class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            sb.append(ch);
        }
        char[] str=sb.toString().toCharArray();
        Arrays.sort(str);

        StringBuilder sb2=new StringBuilder();
        int i=0;

        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            sb2.append(str[i]);
            i++;
            }
            else
            sb2.append(ch);
        }
        return sb2.toString();
    }
}
