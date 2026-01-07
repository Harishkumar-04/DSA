class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
 
        // int[] arr1 = new int[n];
        // int i=0;
        // for(int j=0;j<n&&i<n;j++){

        //     if(arr[j]!=0)
        //     arr1[i++]=arr[j];
        //     else{
        //     if(i<n-2){
        //     arr1[i++]=0;
        //     arr1[i++]=0;}
        //     }
        // }
        // int k=0;
        // for(int num:arr1){
        //     arr[k++]=num;
        // }
         
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                int j = arr.length-1;
                while( j>i){
                    arr[j] = arr[j-1];
                    j--;
                }
                if(i+1 < n) arr[i+1]=0;
                i++;
            }
        }
       

    }
}

            















