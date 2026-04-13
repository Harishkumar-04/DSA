/*class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int max = 0;

        int fReplace = 0, j = 0;
        for (int i = 0; i < answerKey.length(); i++) {

            if (answerKey.charAt(i) == 'F')
                fReplace++;

            while (fReplace > k) {
                if (answerKey.charAt(j) == 'F') fReplace--;
                j++;
            }

            max = Math.max(max, i - j + 1);
        }

        int tReplace = 0, j = 0;

        for (int i = 0; i < answerKey.length(); i++) {

            if (answerKey.charAt(i) == 'T')
                tReplace++;

            while (tReplace > k) {
                if (answerKey.charAt(j) == 'T') tReplace--;
                j++;
            }

            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}
*/

class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int j=0,max=0,fCount=0,tCount=0;
        for (int i = 0; i < answerKey.length(); i++) {

            if (answerKey.charAt(i) == 'T') tCount++;
            else fCount++;
                

            while (Math.min(tCount,fCount)>k) {
                if (answerKey.charAt(j) == 'T') tCount--;
                else fCount--;
                j++;
            }

            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}