class Solution {
    public String reverseByType(String s) {
        List<Character> list1=new ArrayList<>();
        List<Character> list2=new ArrayList<>();

        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch))
            list1.add(ch);
            else
            list2.add(ch);
        }
        Collections.reverse(list1);
        Collections.reverse(list2);

        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
            sb.append(list1.get(i));
            i++;
            }
            else{
            sb.append(list2.get(j));
            j++;
            }
        }
        return sb.toString();
    }
}