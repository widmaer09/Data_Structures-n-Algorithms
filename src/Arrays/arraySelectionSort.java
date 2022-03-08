package Arrays;

public class arraySelectionSort {

    public static void main(String args[]){


        arrayHelper Array = new arrayHelper(10);
        System.out.println(Array.toString());

        //selection sort

        for (int lastUnsortedIndex= Array.intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest=0;

            for (int i=1;i<= lastUnsortedIndex;i++){
                if (Array.intArray[i]>Array.intArray[largest]){
                    largest=i;

                }
            }
            Array.swap(Array.intArray,largest,lastUnsortedIndex);

        }
        System.out.println(Array.toString());









    }




}
