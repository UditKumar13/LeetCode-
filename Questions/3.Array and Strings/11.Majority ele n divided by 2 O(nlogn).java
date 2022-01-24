/*
Problem :

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/


class Solution {
    public int majorityElement(int[] nums) {
      Arrays.sort(nums) ;
     int mid = (nums.length-1)/2 ; 
     return nums[mid];
      
      
    }
}