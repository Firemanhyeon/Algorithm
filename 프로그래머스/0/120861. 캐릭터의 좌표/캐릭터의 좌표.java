class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        if(board[0]%2==1){
            board[0] = (board[0]-1)/2;
        }else{
            board[0]=board[0]/2;
        }
        if(board[1]%2==1){
            board[1]=(board[1]-1)/2;
        }else{
            board[1]= board[1]/2;
        }

        int minX = -board[0];
        int maxX = board[0];
        int minY = -board[1];
        int maxY = board[1];
        for(int i=0;i<keyinput.length;i++){
            //왼쪽키 입력
            if(keyinput[i].equals("left")){
                if(answer[0]==minX){
                    continue;
                }
                answer[0]=answer[0]-1;
            }
            //오른쪽키 입력
            else if(keyinput[i].equals("right")){
                if(answer[0]==maxX){
                    continue;
                }
                answer[0]=answer[0]+1;
            }
            //위로키 입력
            else if(keyinput[i].equals("up")){
                if(answer[1]==maxY){
                    continue;
                }
                answer[1]=answer[1]+1;
            }
            //아래키입력
            else if(keyinput[i].equals("down")){
                if(answer[1]==minY){
                    continue;
                }
                answer[1]=answer[1]-1;
            }
        }
        return answer;
    }
}