class Solution {
    public String reverseWords(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (String str : s.split(" ")) {
            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            sb.append(str).append(" ");
            break;
        }

        List<String> list = new ArrayList<>();
        for (String str : s.split(" ")) {
            list.add(str);
        }
        if(list.size()>1){
        

        for (int i = 1; i < list.size() - 1; i++) {
            String str2 = list.get(i);
            int count2 = 0;
            for (char c : str2.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count2++;
                }
            }
            if (count == count2) {
                String rev = new StringBuilder(str2).reverse().toString();
                sb.append(rev).append(" ");
            } else {
                sb.append(str2).append(" ");
            }
        }

            int count3 = 0;
            String str3 = list.get(list.size() - 1);
            for (char c : str3.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count3++;
                }
            }
            if (count == count3) {
                String rev2 = new StringBuilder(str3).reverse().toString();
                sb.append(rev2);
            } else {
                sb.append(str3);
            }
        }
        return sb.toString().trim();

    }
}