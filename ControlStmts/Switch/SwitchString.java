public class SwitchString{
    public static void main(String[] args){
        String levelString="Expert";
        int level=0;
        switch(levelString){
            case "Beginer":level=1;
            break;
            case "Intermediate":level=2;
            break;
            case "expert":level=3;
            break;
            default:level=0;
            break;
        }
        System.out.println("your level is:"+level);
    }
}