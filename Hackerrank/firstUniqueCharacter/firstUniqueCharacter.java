class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] charArray = new char[s.length()];
        charArray = s.toCharArray();
        for(int i =0;i<charArray.length;i++){
            freq[charArray[i]-'a']++;

        }
        for(int i =0;i<charArray.length;i++){
            if(freq[charArray[i]-'a']==1){
                return i;
            }
        }
        return -1;
        
    }
}
