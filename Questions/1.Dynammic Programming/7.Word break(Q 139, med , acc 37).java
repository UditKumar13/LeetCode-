class Solution {
    public boolean wordBreak(String s, List<String> dict) {
        
      
        boolean[] f = new boolean[s.length() + 1];
        
        f[0] = true;
        
     
        
        //Second DP
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && dict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }
        
        // f[j] is tracking the record of the previous match and another match also starts 
        // from prev + 1 
        
        
        return f[s.length()];
 
    }   
}