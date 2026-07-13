class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();

        for(int i=1;i<=9;i++){
            int n1=i;
            int n2=i+1;

            while(n1<=high && n2<=9){
                n1=n1*10+n2;
                if(n1>=low && n1<=high){
                    list.add(n1);
                }
                n2++;
            }
        }
        Collections.sort(list);
        return list;
    }
}


/*class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();

        String s="123456789";

        int lowlen=String.valueOf(low).length();
        int highlen=String.valueOf(high).length();

        for(int len=lowlen;len<=highlen;len++){
            for(int i=0;i+len<=9;i++){
                int num=Integer.parseInt(s.substring(i,i+len));

                if(num>=low && num<=high){
                    list.add(num);
                } 
            }
        }
        return list;
    }
}
*/