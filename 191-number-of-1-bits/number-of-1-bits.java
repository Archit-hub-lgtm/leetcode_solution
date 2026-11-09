class Solution {
    public int hammingWeight(int n) {
        String ans = "";
        for(int i=0; i<32; i++) {
            int x = n % 2;
            ans += x;
            n /= 2;
        } 
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0; i<ans.length(); i++) {
            h.put(ans.charAt(i),h.getOrDefault(ans.charAt(i),0)+1);
        }
        int res = h.get('1');
        return res; 
    }
}