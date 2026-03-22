class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set=new HashSet<>();
        int[] arr=new int[A.length];
        int cnt=0;
        for(int i=0;i<A.length;i++){
            if(!set.add(A[i])){
                cnt++;
            }
            if(!set.add(B[i])){
                cnt++;
            }
            arr[i]=cnt;
        }
        return arr;        
    }
}