import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean twoSum(int[] nums, int target) {
        /*
        Given an array of integers, return true if there are two numbers in the array such that they add up to a specific target. Else, return false
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
         */
        boolean output = false; //comment
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>(); // num -> index
        for (int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if (myMap.containsKey(curr)){
                output = true;
            } else{
                myMap.put(target - curr, i);
            }
        }
        if (output){
            return true;
        }
        else{
            return false;
        }
    }
}
