import java.util.Scanner;

class Main {
    public static void main(String[]args){
        System.out.println("Welcome to the Calculator!");
        System.out.println("Please select no.of operands:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Input in = new Input();
        in.input(n);
        sc.close();
    }
}