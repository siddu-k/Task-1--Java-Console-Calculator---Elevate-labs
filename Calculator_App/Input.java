import java.util.Scanner;
public class Input {
    
void input(int n){
      
    Scanner sc2= new Scanner(System.in);
    int i=0;
    int[] nums = new int[n];

    while(i<n){
      
        System.out.println("Enter the "+(i+1)+" number :");
        nums[i] = sc2.nextInt();
        i++;
    }
            System.out.println("---------------------------------");


    Selt sel = new Selt();
    sel.select(nums);
    sc2.close();

   

}



}
