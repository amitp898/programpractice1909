package Practice1909;

public class reversewordofStringwithsameorder {
    public static void main(String[]args){
        String s1 = "This is my java program";
        String [] words = s1.split(" ");
        String reverse = "";
        for(String word : words) {
            String reverseword = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseword = reverseword + word.charAt(i);

            }
            reverse = reverse + " " + reverseword;

        }


            System.out.println(reverse);

        }




}

