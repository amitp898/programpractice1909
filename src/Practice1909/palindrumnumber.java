package Practice1909;

import java.util.Scanner;

public class palindrumnumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value:");
        int num = sc.nextInt();
        int rev = 0;
        int rem = 0;
        int pal = num;
        while(num>0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(rev == pal){
            System.out.println(pal + "is paliendrum number");
        }
        else {
            System.out.println(pal + "is not paliendrum number");
        }
    }
}
