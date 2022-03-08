package Arrays;

public class arrayRecursion {

    public static int iterativeFactorial(int num){
        if (num==0){
            return 1;
        }
        int factorial =1;
        for(int  i=1;i<=num;i++){
            factorial*=i;

        }
        return factorial;
    }




    public static int recursiveFactorial(int num){
        if(num ==0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }
}
