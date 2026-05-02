class Solution {
    public long dividePlayers(int[] skill) {
        int tot=0;
        int n=skill.length;
        int team=n/2;
        
        Map<Integer,Integer> map=new HashMap<>();

        for(int num:skill){
            tot+=num;
            map.put(num,map.getOrDefault(num,0)+1);        
        }
        if (tot % team != 0) return -1;


        int spt=tot/team;
        long res=0;

        for(int num:skill){
            if(map.get(num)==0) continue;

            int req=spt-num;

            if(!map.containsKey(req) || map.get(req)==0) return -1;
            
            if(num==req && map.get(num)<2) return -1;

            res+=num*req;

            map.put(num,map.get(num)-1);
            map.put(req,map.get(req)-1);
        }
        return res;      
    }
}