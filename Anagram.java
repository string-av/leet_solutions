class Anagram {
    public boolean isAnagram(String s, String t) {
        
        char[] s_ar = s.toCharArray();
        char[] t_ar = t.toCharArray();
        boolean ans;
        
        if (s_ar.length != t_ar.length) {
            return false;
        } else {
            Arrays.sort(s_ar);
            Arrays.sort(t_ar);
            ans = Arrays.equals(s_ar, t_ar);
        }
        
        return ans;
    }
}
