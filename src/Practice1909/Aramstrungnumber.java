package Practice1909;

import java.util.Scanner;

public class Aramstrungnumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value:");
        int num = sc.nextInt();
        int arm = num;
        int sum = 0;
        int rem = 0;
        while(num >0){
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if(sum == arm){
            System.out.println(arm + "is aramstrung number");
        }
        else{
            System.out.println(arm + "is not aramstrung number");
        }
    }
}
