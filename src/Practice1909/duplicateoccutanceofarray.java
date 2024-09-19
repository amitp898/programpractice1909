package Practice1909;

import java.util.HashMap;
import java.util.Map;

public class duplicateoccutanceofarray {
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5,6,5,4,3,2,2,1,2,3,4,4,4,5,5,3,2,2,1,2,4,2,2,1,3,2,3,4,4,5,4,3,5,4,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x, 1);
            }
        }
        for(Map.Entry<Integer, Integer>entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " "+ "occred"+ " "+ entry.getValue()+" "+ "Times");
            }
        }
    }
}
