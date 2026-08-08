class Solution {
    public boolean isPalindrome(String s) {
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                ss = ss + c;
            }
        }
        ss = ss.toLowerCase();
        int i = 0, j = ss.length() - 1;
        while (j > i) {
            if (ss.charAt(i) != ss.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
