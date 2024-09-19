package Practice1909;

public class getthevaluefromarraywhosetotalis10 {
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5,6,5,4,3,2,2,1,2,3,4,4,4,5,5,3,2,2,1,2,4,2,2,1,3,2,3,4,4,5,4,3,5,4,3};
        int total = 10;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0;j<=i;j++){
                if(arr[i] + arr[j] == total & i != j){
                    System.out.println(arr[i] + " "+ arr[j]);

                }

            }

        }
    }
}
