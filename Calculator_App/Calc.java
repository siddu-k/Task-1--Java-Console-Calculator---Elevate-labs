public class Calc {
    int ans;
    //adding method
        void add (int[] nums){

             if(nums.length == 0){
            System.out.println("Error: No numbers to add!");
            return;
        }
        for(int i=0;i<nums.length;i++){
           ans+=nums[i]; 
        }
        System.out.println("the sum is :"+ans);
        }


        //multiplication method
        void mul (int[] nums){
             if(nums.length == 0){
            System.out.println("Error: No numbers to multi!");
            return;
        }
        for(int i=0;i<nums.length;i++){
             ans*=nums[i]; 
        }
        System.out.println("the mul is :"+ans);

        }


        //subtraction method
        void sub (int[] nums){
             if(nums.length == 0){
            System.out.println("Error: No numbers to subtract!");
            return;
        }

        for(int i=0;i<nums.length;i++){
                 ans-=nums[i]; 
        }
        System.out.println("the sub is :"+ans);

        }
    //division method - improved with zero handling
        void div(int[] nums){
        // Check if array is empty
        if(nums.length == 0){
            System.out.println("Error: No numbers to divide!");
            return;
        }
        
        // Start with the first number instead of 0
        double result = nums[0];
        
       
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 0){
                System.out.println("Error: Cannot divide by zero! Division stopped at number " + (i+1));
                return;
            }
            result = result / nums[i];
        }
        
        
        if(result == (int)result){
            System.out.println("the div is :" + (int)result);
        } else {
            System.out.printf("the div is :%.2f%n", result);
        }
    }
}