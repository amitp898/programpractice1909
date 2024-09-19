package Practice1909;

public class ReverseString {
    public static void main(String [] args){
        String s1 = "This is Hello World";
        String reverse = "";
        String [] words = s1.split(" ");
        for(String word : words){
            reverse = word + " "+ reverse;

        }
        System.out.println(reverse);
    }
}
