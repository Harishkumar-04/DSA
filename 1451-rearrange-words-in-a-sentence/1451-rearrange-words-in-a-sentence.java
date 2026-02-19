class Solution {
    public String arrangeWords(String text) {
        
        text = text.toLowerCase();
        
        String[] words = text.split(" ");
        
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        
        String result = String.join(" ", words);
        
        return Character.toUpperCase(result.charAt(0)) + result.substring(1);
    }
}


/*class Solution {
    public String arrangeWords(String text) {
        String str=text.toLowerCase();
        String[] arr=str.split(" ");

        Arrays.sort(arr,Comparator.comparingInt(String::length));

        StringBuilder sb=new StringBuilder();  
        arr[0]=arr[0].substring(0,1).toUpperCase()+arr[0].substring(1,arr[0].length());
        
        for(String s:arr)
        sb.append(s).append(" ");
    

        return sb.toString().trim();
    }
}
*/