package Practice1909;

public class ReversewordsofString {
    public static void main(String[]args) {
        String s1 = "This is my java program";
        String reverse1 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            reverse1 = reverse1 + " " + s1.charAt(i);

        }
        System.out.println(reverse1);

    }
}
