class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        boolean x = false;
        boolean y = false;

            if(dot[0]>0){
                x=true;
            }
            if(dot[1]>0){
                y=true;
            }
        
        if(x && y ){
            answer=1;
        }else if(!x&& y){
            answer=2;
        }else if( !x && !y){
            answer=3;
        }else if(x && !y){
            answer=4;
        }
        
        return answer;
    }
}