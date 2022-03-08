package Arrays;

public class arrayInsertionSort {
    //insertion sort is a stable sort algorithm

    public static void main(String args[]){
        arrayHelper Array = new arrayHelper(10);
        System.out.println(Array.toString());

        for (int firstUnsortedIndex=1;firstUnsortedIndex<Array.intArray.length;firstUnsortedIndex++) {
            int newElement= Array.intArray[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i > 0 && Array.intArray[i-1]> newElement;i--){
                Array.intArray[i]=Array.intArray[i-1];

            }
            Array.intArray[i] =newElement;

        }
        System.out.println(Array.toString());




    }
}
