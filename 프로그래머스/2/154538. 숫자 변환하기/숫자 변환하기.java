import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;
        if(x==y){
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(x);
        int[] visited = new int[y+1];
        Arrays.fill(visited,-1);
        visited[x]=0;

        while(!pq.isEmpty()){
            int current = pq.poll();
            int[] values = {current+n , current*2,current*3};

            for(int val : values){
                if(val>y){
                    continue;
                }
                if(visited[val] ==-1 || visited[val] > visited[current]+1){
                    visited[val] = visited[current]+1;
                    pq.add(val);
                }
                if(val==y){
                    return visited[val];
                }
            }
        }
        return answer;
    }
      
}