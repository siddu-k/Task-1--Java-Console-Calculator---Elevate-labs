import java.util.Scanner;

public class Selt {
    
    void select(int[] nums){

        System.out.println("Enter the operation to perform");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("1 ) Addition");
        System.out.println("2 ) Subtraction");
        System.out.println("3 ) Multiplication");
        System.out.println("4 ) Division");

        int opt = sc3.nextInt();
        Calc cal = new Calc();
        System.out.println("---------------------------------");

        switch (opt) {
            case 1: System.out.println("Selected Operation: Addition");
                cal.add(nums);
                break;
             case 2:System.out.println("Selected Operation: Subtraction");
                cal.sub(nums);
                break;
             case 3:System.out.println("Selected Operation: Multiplication");
                cal.mul(nums);
                break;
             case 4:System.out.println("Selected Operation: Division");
                cal.div(nums);
                break;            
            default:
                break;
        }

        
        sc3.close();
    }



}
