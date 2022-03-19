public class Solution {
    public int findMedian(int[][] A) {

        int n = A.length ; 
        int m = A[0].length ; 
         int [] farr = new int [n*m] ;
        int c = 0 ; 
        for (int i =0 ; i< n ; i++){ 
             for(int j = 0;j<m ; j++){
                farr[c]  = A[i][j] ;
                c++ ;  
             }
        }

        // array has been filled

        Arrays.sort(farr) ;
        int ans =  0 ; 
        int num = farr.length ; 
        ans = num / 2 ;
        return farr[ans] ; 



    }

}