package Practice1909;

public class fibonaciseries {
    public static void main(String [] args){
        int n1 = 0;
        int n2 = 1;
        int count = 10;
        int n3;
        System.out.println("First two numbers of fibonaci series is" + n1 + " " + n2);
        for(int i = 2; i<count;i++){

            n3 = n1 + n2;

            n1 = n2;
            n2 = n3;
            System.out.println(n3);


        }

    }
}
