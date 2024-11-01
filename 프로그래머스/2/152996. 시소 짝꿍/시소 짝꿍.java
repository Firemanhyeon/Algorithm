import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Double, Integer> map = new HashMap<>();
        
        for (int weight : weights) {
            double w = (double) weight;

            answer += map.getOrDefault(w, 0);         
            answer += map.getOrDefault(w * 2.0 / 3, 0);  
            answer += map.getOrDefault(w * 3.0 / 2, 0);    
            answer += map.getOrDefault(w * 3.0 / 4, 0); 
            answer += map.getOrDefault(w * 4.0 / 3, 0);   
            answer += map.getOrDefault(w / 2, 0);        
            answer += map.getOrDefault(w * 2, 0);      

            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        return answer;
    }
}
