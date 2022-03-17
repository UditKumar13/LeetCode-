
// Brute force 
TC : O(n)

Sc: O(1)
class Solution {
    public int mySqrt(int x) {
     
        int ans = 0 ; 
        for(int i =1 ; i<=x ; i++){
            int i2 = i*i ; 
            
            if (i2 == x){
                ans = i ; 
                break ; 
            }
             if ( i2 > x){
                ans = i-1 ; 
                 break ; 
            }
        }
     return ans ; 
    }   
}


// Binary search with this 

