class Segment {
    public int countSegments(String s) {
        String[] words = s.split(" ");
        int count = 0;
        for (String i: words) {
            if (!i.equals("")) {
                count++;
            }
        }
        return count;
    }
}
