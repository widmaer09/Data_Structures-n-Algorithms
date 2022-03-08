package Arrays;

//Array bubble  Sort
public class arrayBubbleSort {

    public static void main(String[] args){

        arrayHelper Array = new arrayHelper(30);
        System.out.println(Array.toString());

        //bubble sort
        for (int lastUnsortedIndex = Array.intArray.length -1;lastUnsortedIndex>0;lastUnsortedIndex--){
            for (int i =0;i <lastUnsortedIndex;i++){
                if (Array.intArray[i] > Array.intArray[i+1] ){
                    Array.swap(Array.intArray,i,i+1);
                }
            }

        }
        System.out.print(Array.toString());




    }
}
