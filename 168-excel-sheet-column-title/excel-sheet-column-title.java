class Solution {
    public String convertToTitle(int columnNumber) {
        
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        while(columnNumber>0) {
            columnNumber--;
            int a = columnNumber % 26;
            result = str.charAt(a) + result;

            columnNumber = columnNumber / 26;
        }
        return result;
    }
}