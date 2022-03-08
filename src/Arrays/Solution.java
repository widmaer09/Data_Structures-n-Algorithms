package Arrays;

import java.util.ArrayList;

public class Solution {
    public static int twoSum(int[] nums, int target) {
        int[] my_array = new int[2];
        for (int i=0;i< nums.length;i++){
            for(int j=nums.length-1;j>0;j--){
                if(nums[i]+nums[j]==target){


                    my_array[0]=i;
                    my_array[1]=j;



                }
            }
        }


        return my_array[1];
    }
    public static String lengthOfLongestSubstring(String s) {

        StringBuilder mainString = new StringBuilder();



        for(int i =0;i<s.length();i++){
            mainString.append(s.charAt(i));

        }

        StringBuilder tempString = new StringBuilder();
        StringBuilder compare = new StringBuilder();

        ArrayList<StringBuilder> allWords=new ArrayList<StringBuilder>();

        int start=0;

        int end=0;

        for(int a=0;a<mainString.length();a++){
            if (a==0){
                tempString.append(mainString.charAt(a));
                allWords.add(tempString);
                System.out.println("i");





            }else {
                for(int b=0;b<allWords.size();b++){
                compare.append(mainString.substring(a,a));
                if(allWords.get(b)== compare){
                    tempString.append( compare.append(mainString.substring(start,b-1)));
                    allWords.add(tempString);
                    start++;


                }else{tempString.append(mainString.charAt(a));
                    System.out.println("hi");

                }

            }


            }
        }





        String result = allWords.get(0).toString();
        return result;
    }





    public static void main(String args[]){
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        //System.out.print(twoSum(nums,target));

        String example ="acgabhj";
        System.out.print(lengthOfLongestSubstring(example));


    }
}
