import java.util.*;
class Solution {
    int count=0;
    int[] arr = {1,2,3,1};
    int a=0;
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<ingredient.length;i++){
            list.add(ingredient[i]);
            if(list.size()>=4){
                if(list.get(list.size()-1) == arr[3] && list.get(list.size()-2) == arr[2] && list.get(list.size()-3) == arr[1] && list.get(list.size()-4) == arr[0]){
                    count++;
                    for(int j=0;j<4;j++){
                        list.remove(list.size()-1);
                    }
                }
            }
        }
        return count;
    }

}