package Arrays;

public class factorialRecursion {

    public static  int iterativeFactorial2(int num){
        if(num==0){
            return 1;

        }
        int factorial =1;
         for (int i =1; i <= num; i++){
             factorial*= i;
         }
         return factorial;
    }

    public static int recursiveFactorial(int num){
        if (num ==0){
            return 1;
        }
        return num* recursiveFactorial(num-1);
    }

    public static void main(String args[]){

        System.out.println(iterativeFactorial2(4));
        System.out.println(recursiveFactorial(4));

    }


}
