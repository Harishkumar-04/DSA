class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");

        Map<String,Integer> map=new HashMap<>();

        for(String s:str1)
        map.put(s,map.getOrDefault(s,0)+1);

        for(String s:str2)
        map.put(s,map.getOrDefault(s,0)+1);

        List<String> list=new ArrayList<>();

        for(String s:map.keySet()){
            if(map.get(s)==1)
            list.add(s);
        }

        String[] res=new String[list.size()];
        int i=0;

        for(String s:list){
        res[i]=s;
        i++;
        }
        return res;
    }
}


        //for(String s:list)

        // String[] str1=s1.split(" ");
        // String[] str2=s2.split(" ");
        // if(str1.length!=str2.length) return 0;
        // Set<String> set=new HashSet<>();
        // List<String> list=new ArrrayList<>();

        // for(int i=0;i<str1.length;i++){
        //     set.add(str1[i]);
        // }
        // for(int i=0;i<str2.length;i++){
        //     if(set.add(str2[i])){
        //         list.add(str1[i]);
        //         list.add(str2[i]);
        //     }
        // }
