public class ErrorEx{
    public static void recursiveCall(){
        recursiveCall();
    }

    public static void main(String[] args){
        try{
            recursiveCall();
        }
        catch(StackOverflowError e){
            System.out.println("caught stack oevrflow error"+e.getMessage());
        }

        try{
            int[] largeArray=new int[Integer.MAX_VALUE];
        }catch(OutOfMemoryError e){
            System.out.println("Caught outof memory error:"+e.getMessage());
        }
    }
}