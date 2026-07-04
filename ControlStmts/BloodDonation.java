public class BloodDonation{
    public static void main(String[] args){
        int age=67;
        int weight=45;
        if(age>18){
            if(weight>50){
                System.out.println("person is eligable for blood donation");
            }
            else{
                System.out.println("person is not eligable for blood donation");
            }
        }
        else{
            System.out.println("age must be greater than 18");
        }
    }
}