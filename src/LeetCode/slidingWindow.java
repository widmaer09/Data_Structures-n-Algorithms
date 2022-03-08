package LeetCode;
//sliding window withing an array
//can be fixed or dynamic sized
//good for things we iterate over sequentially
//strings array or linked list
//when your trying to find the min,max,longest,shortest, contained
//maybe we need to record the max sum


/*Fixed Length*/
//max sum subarray of size k--- fixed length

/*Dynamic Variant*/
//smallest sum >= to some value S

/*Dynamic Variant w/ auxillary data structure*/

//longest substring w/ no more than K distinct characters


//String Permutations

/*commanalities*/
//everything grouped sequentialy
//longest/smallest/contains/max/min


import java.sql.Array;
import java.util.HashSet;

/**
 * find the max sum subarray of a fixed size k
 *
 * example input:[4,2,1,7,8,1,2,8,1,0]
 */

//static size algo

public class slidingWindow {
    public static void findMaxSumSubarray(int[] arr, int k){
        int maxValue= Integer.MIN_VALUE;//intaiall zero because we dont know the max yet
        int currentRunningSum=0;// the sum of the 3 sequential indexs
        int[] set=new int[3];


        for(int i=0;i<arr.length;i++){
            currentRunningSum+=arr[i];


            if (i>= k-1){//if i is at index arr[2] then we start moving window


                maxValue=Math.max(maxValue,currentRunningSum);//when we are at arr[2] we calculate the maxvalue
                if(currentRunningSum== maxValue){
                    set[0]=i-(k-1);
                    set[1]=i-1;
                    set[2]=i;
                }

                currentRunningSum -= arr[i-(k-1)];// this line of code removes arr[0]



            }
        }

        for (int j=0;j<set.length;j++){
            System.out.println(set[j]);
        }
    }
    //dynamically changing size algo
    public static int smallestSubarray(int targetSum, int[] arr){
        int minWindowSize= Integer.MAX_VALUE;
        int currentWindowSum=0;
        int windowStart=0;


        for(int windowEnd =0;windowEnd<arr.length;windowEnd++){
            currentWindowSum +=arr[windowEnd];
            while (currentWindowSum >= targetSum){
                minWindowSize=Math.min(minWindowSize,windowEnd-windowStart+1);
                currentWindowSum -=arr[windowStart];//shrinking process
                windowStart++;
            }


        }return minWindowSize;



    }

    //LeetCode Longest Substring Without Repeating Characters Solution Explained - Java

    public static int lengthOfLongestSubstring(String s){
        int a_pointer=0;
        int b_pointer=0;
        int max=0;

        HashSet<Character> hash_set = new HashSet<>();//stores the uniques characters/ reports the max length
        while (b_pointer<s.length()){
            if(!hash_set.contains(s.charAt(b_pointer))) {//new element not in hash set
                hash_set.add(s.charAt(b_pointer));//add the new element
                b_pointer++;//slide pointer up one
                max = Math.max(hash_set.size(), max);//update new max length
            }else {
                hash_set.remove(s.charAt(a_pointer));//remove duplicate pointer
                a_pointer++;//shift the first pointer up one to find a longer string with no dup
            }
        }return max;
    }














   public static void main(String[] args) {
        findMaxSumSubarray(new int[]{7,8,14,2,1,2,8,1,0},3);
      // System.out.println(smallestSubarray(8,new int[]{4,2,2,7,8,1,2,8,10}));
     //  System.out.println(lengthOfLongestSubstring("pwwwwwkew"));



    }
}
