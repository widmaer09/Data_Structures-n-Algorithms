package Arrays;

public class arrayShellSort {
        //unstable algorithm
        //works better than insertion sort
        //the time complexity varies because of the gap

    public static void main(String args[]){
        arrayHelper Array = new arrayHelper(10);
        System.out.println("Shell sort array unsorted: ");
        System.out.println(Array.toString());

        for(int gap=Array.intArray.length/2; gap >0; gap/=2){
            for(int i = gap;i<Array.intArray.length;i++){
                int newElement = Array.intArray[i];
                int j=i;
                while (j>= gap && Array.intArray[j-gap]> newElement){
                    Array.intArray[j] = Array.intArray[j-gap];
                    j-= gap;
                }
                Array.intArray[j] = newElement;
            }





        }
        System.out.println("Shell sort array sorted: ");
        System.out.println(Array.toString());




    }



}
