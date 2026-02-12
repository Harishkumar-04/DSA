class Solution {
    public int[] plusOne(int[] digits) {
       
            
            for(int i=digits.length-1;i>=0;i--){
                if(digits[i]==9){
                    digits[i]=0;
                }
                else if(digits[i]<9){
                digits[i]+=1;
                break;
                }
            }

            int count=0;
            for(int num:digits){
                if(num==0)
                count++;
            }
            if(count==digits.length){
                int[] arr=new int[count+1];

                for(int i=0;i<arr.length;i++){
                    if(i==0){
                        arr[i]=1;
                    }
                    else
                    arr[i]=0;
                }
                return arr;
            }
            

        return digits;
    }
}
