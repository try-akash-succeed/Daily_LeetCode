import java.util.*;
public class MinIndexSum {

    public String[] findRestaurant(String[] list1, String[] list2) {

        int n1 = list1.length;
        int n2 = list2.length;

        int min=Integer.MAX_VALUE;
        HashMap<String,Integer> hm = new HashMap<>();

        for(int i=0;i<n1;i++){
            hm.put(list1[i],i);
        }

        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<n2;i++){
            if(hm.containsKey(list2[i])){
                if(min>i+hm.get(list2[i])){
                    min = i+hm.get(list2[i]);
                    list.clear();
                    list.add(list2[i]);
                }
                else if(min==i+hm.get(list2[i])){
                    list.add(list2[i]);
                }
            }
        }
       return list.toArray(new String[list.size()]);
        
    }
    
}
