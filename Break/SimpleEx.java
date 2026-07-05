public class SimpleEx{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int targetvalue=4;
      for(int i=0;i<=arr.length;i++){
        if(arr[i]==targetvalue){
            System.out.println("Found");
            break;

        }
      }  
    }
}