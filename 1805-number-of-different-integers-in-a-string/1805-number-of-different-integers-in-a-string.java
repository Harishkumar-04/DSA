class Solution {
    public int numDifferentIntegers(String word) {
        String result = word.replaceAll("[a-z]", " ");
    
        String[] nums = result.split(" ");

        Set<String> set=new HashSet<>();

        for(String n:nums){
            if(n.length()==0) continue;

            n=n.replaceAll("^0+","");

            if(n.length()==0) n="0";

            set.add(n);
        }
        return set.size();
    }
}