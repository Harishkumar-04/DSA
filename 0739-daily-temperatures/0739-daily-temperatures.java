class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Pair> st=new Stack<>();
        int n=temp.length-1;
        for(int i=n;i>=0;i--){
            int currtemp=temp[i];
            while(!st.isEmpty()){
                if(currtemp<st.peek().value){
                    temp[i]=st.peek().index-i;
                    break;
                }
                else{
                    st.pop();
                }
            }
            if(st.isEmpty()) temp[i]=0;

            st.push(new Pair(currtemp,i));
        }
        return temp;
    }

    static class Pair { 
        int value; 
        int index; 
        Pair(int temp, int index) { 
            this.value = temp; 
            this.index = index; 
        } 
    }
}