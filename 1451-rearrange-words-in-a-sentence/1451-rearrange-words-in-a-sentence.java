class Solution {
    public String arrangeWords(String text) {
        String str=text.toLowerCase();
        String[] arr=str.split(" ");

        Arrays.sort(arr,Comparator.comparingInt(String::length));

        StringBuilder sb=new StringBuilder();  
        arr[0]=arr[0].substring(0,1).toUpperCase()+arr[0].substring(1,arr[0].length());
       // System.out.println(arr[0]);      
        
        for(String s:arr)
        sb.append(s).append(" ");
    

        return sb.toString().trim();
    }
}