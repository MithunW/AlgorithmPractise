class Solution {
    public int lengthOfLongestSubstring(String s) {
         int i = 0;
         int maxLength = 1;
         int wLength =2;
         if(s.equals("")){
            return 0;
         }
         
         while((i<s.length()) && (wLength<=s.length())){
            
            while(i+wLength<=s.length()){
                String sub = s.substring(i,i+wLength);
                if(!isRepeatingString(sub)){
                    maxLength=wLength;
                    wLength++;
                }else{
                    break;
                }
                
                
            }
            if(maxLength==26){
                break;
            }
            i++;
         }
         return maxLength;
    }

    public boolean isRepeatingString(String s){
        HashSet<Character> nonRepeat = new HashSet<>();
        for(char c:s.toCharArray()){
            if(!nonRepeat.add(c)){
                return true;
            }
        }
        return false;
    }
}