/*

You are given an integer array nums of length n which represents a permutation of all the integers in the range [0, n - 1].

The number of global inversions is the number of the different pairs (i, j) where:

0 <= i < j < n
nums[i] > nums[j]
The number of local inversions is the number of indices i where:

0 <= i < n - 1
nums[i] > nums[i + 1]
Return true if the number of global inversions is equal to the number of local inversions.

 
 
 Explanation : 
 https://leetcode.com/problems/global-and-local-inversions/discuss/150991/From-intuition-to-optimization
*/

class Solution {
  
 
    public boolean isIdealPermutation(int[] arr) {
        
      for(int  i =0 ; i<arr.length ; i++){
        
        // this is the beautiful work of the intution and the constaraints of n-1 numbrs being the permutaion of n-1 
        if(Math.abs(arr[i] - i) > 1) return false ; 
      }
      return true ; 

    }
}