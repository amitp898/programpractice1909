package Practice1909;

import java.util.HashMap;
import java.util.Map;

public class occuranceofduplicatevalueinString {
    public static void main(String[]args){
        String s1 = "tryujubfbjfiuwuyetytrthtrqwfdgvbcbnjegetrerh";
        HashMap<Character, Integer>map = new HashMap<>();
        for(int i = 0; i<s1.length(); i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }
            else{
                map.put(s1.charAt(i), 1);
            }

        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " "+ "occred"+ " "+ entry.getValue()+" "+ "Times");
            }
        }
    }
}
