class RevWord {
    public String reverse(String w) {
        String rev = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            rev += w.charAt(i);
        }
        return rev;
    }
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        String ans = "";
        for (int i = 0; i < word.length; i++) {
            if (i == word.length - 1) {
                ans += reverse(word[i]);
            } else {
                ans += reverse(word[i]) + " ";
            }
        }
        return ans;
    }
}
