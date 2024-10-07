import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Queue<Character> q = new LinkedList<>();
        for(int i=0;i<skill_trees.length;i++){
            q = new LinkedList<>();
            for(int j=0;j<skill.length();j++){
                q.add(skill.charAt(j));
            }
            boolean chk = true;
            for(int k=0;k<skill_trees[i].length();k++){
                
                if(q.contains(skill_trees[i].charAt(k))){
                    if(q.peek()==skill_trees[i].charAt(k)){
                        q.poll();
                    }else{
                        chk=false;
                        break;
                    }
                }
            }
            if(chk){
                answer++;
            }
            
        }
        
     
        return answer;
    }
}