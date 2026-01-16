class Solution {
    public boolean isStrictlyPalindromic(int n) {

        /*
         A number n is strictly palindromic only if
         its representation is palindromic in ALL bases
         from 2 to (n - 2).

         Constraints: 4 <= n <= 105

         For n = 4:
         We must check base 2 only.
         4 in base 2 = "100", which is NOT a palindrome.
         So n = 4 is not strictly palindromic.

         For n >= 4, we only need to check one base: (n - 2).
         
         Reason:
         In base (n - 2), the number n is always written as:
             n = 1 * (n - 2) + 2

           (Dividend = Quotient x Divisor  + Remainder)
              100    =    1     x   98     +     2
              186    =    1     x  184     +     2
              365    =    1     x  363     +     2

         So its base (n - 2) representation is "12".

         "12" reversed is "21", which is NOT a palindrome.

         Since n fails in at least one required base,
         it can NEVER be strictly palindromic.

         “This logic applies to all n > 4, and n = 4 also fails in base 2.”
        */

        return false;
    }
}
