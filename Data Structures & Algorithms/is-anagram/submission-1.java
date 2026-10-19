class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }

        int[] cnt = new int[26];

        for(int i=0; i<s.length(); i++) {

            cnt[s.charAt(i)-'a']++;
            
            cnt[t.charAt(i)-'a']--;
        }

        for(int i=0; i<cnt.length; i++) {
            if(cnt[i] != 0) { // if any value is not zero like 2,3,4,5 its not a anagram
                return false;
            }
        }
        return true;
    }
}