class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        
        if (s.length() != t.length()) {
            return false;
        }
        for(int i=0; i<s.length(); i++) {
            h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<t.length(); i++) {
            h2.put(t.charAt(i),h2.getOrDefault(t.charAt(i),0)+1);
        }

        for(char ch : h1.keySet()) {
            if(!h1.get(ch).equals(h2.getOrDefault(ch,0))) {
                return false;
            }
        }
        return true;
    }
}