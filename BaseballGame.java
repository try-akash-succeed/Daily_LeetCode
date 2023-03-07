import java.util.*;
public class BaseballGame {

    public int calPoints(String[] operations) {

    
    int ans =0;
        int n = operations.length;
        ArrayList<Integer> list = new ArrayList<>();


        for(int i=0;i<n;i++){

            if(operations[i].equals("+")){
                int sum = list.get(list.size()-1)+list.get(list.size()-2);
                list.add(sum);
            }
            else if(operations[i].equals("D")){
                int prod = list.get(list.size()-1)*2;
                list.add(prod);
            }
            else if(operations[i].equals("C")){
                list.remove(list.size()-1);
            }
            else{
                int num = Integer.parseInt(operations[i]);
                list.add(num);
            }


        }
        for(int i:list){
            ans+=i;
        }
        return ans;
        
    }

}
