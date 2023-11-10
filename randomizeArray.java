// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        randomize(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void randomize(int[] arr){
        Random random=new Random();
        for(int i=arr.length-1;i>0;i--){
            int j=random.nextInt(i+1);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
