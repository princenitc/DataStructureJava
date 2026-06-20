class Solution {
    public boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int i = 0;
            int j = s.length() - 1;
            while(i <= j) {
                char start = s.charAt(i);
                char end = s.charAt(j);
                if( !(start >= 'a' && start <= 'z') && !(start >= '0' && start <= '9')) {
                    i++;
                    continue;
                }
                if (!(end >= 'a' && end <= 'z') && !(end >= '0' && end <= '9')) {
                    j--;
                    continue;
                }
                if(start != end)
                    return false;
                i++;
                j--;
            }
            return true;
        }
}
