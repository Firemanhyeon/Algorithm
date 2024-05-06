import java.util.*;

class Solution {
    public List solution(int n) {
        int[] answer = {};
        int cnt=0;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
                list.add(i);
            }
        }
        return list;
    }
}