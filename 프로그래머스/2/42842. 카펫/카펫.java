class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown+yellow;//총 칸 개수
        
        for(int i= total;i>0;i--){
            if(total%i==0){
                answer[0] = i;//가로 
                answer[1] = total/i;//세로    
              
                if( (answer[0] -2) * (answer[1]-2) == yellow ){//brown 개수를 뺀 yellow 개수가 yellow랑 같을때 = 정답
                    break;
                }
            }
        }
        
        
        return answer;
    }
}