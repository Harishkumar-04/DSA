class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set=new HashSet<>();
        int[] arr=new int[friends.length];

        for(int num:friends){
            set.add(num);
        }
        int i=0;
        for(int num:order){
            if(!set.add(num)){
                arr[i]=num;
                i++;
            }
        }
        return arr;        
    }
}