package LeetCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    Map<Integer,Integer> num_map = new HashMap<>();
    int nums[];
    int target;
    int example2[];
    TwoSum(int[] nums, int target) {
        this.nums=nums;
        this.target=target;
        twoSum(nums,target);
    }

    public void twoSum( int nums[], int target){



        for(int i=0;i< nums.length;i++){
            int complement = target - nums[i];
            if(num_map.containsKey(complement)){
                example2 = new int[] {num_map.get(complement), i};
            }
            num_map.put(nums[i],i);


        }
       return;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();


        sb.append(example2[0]).append(", ");
        sb.append(example2[1]).append(", ");

        return sb.toString();
    }




    public static void main(String args[]){


        int[] intArray = new int[]{2,11,7,15};
        TwoSum example= new TwoSum(intArray,9);
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>"+line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }







        System.out.println(example);




    }




}
